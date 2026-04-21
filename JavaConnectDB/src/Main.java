import java.sql.*;
import java.util.Scanner;

/*
    A SIMPLE CRUD IN JAVA (21/4/2026 5:32 AM)
    DON'T USE THIS IN ANY CIRCUMSTANCE!
    THIS CRUD IS VULNERABLE TO SQL INJECTION!
 */

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {

        System.out.println("What do you want?\n1) Add a User\n2) Remove a User\n3) See the list of users\n");
        String selection = scanner.nextLine();

        if (selection.equalsIgnoreCase("1")) {

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Password: ");
            String password = scanner.nextLine();

            DbConnection.addUser(name, password);

        } else if (selection.equalsIgnoreCase("2")) {
            System.out.print("Name to be removed: ");
            String nameRemove = scanner.nextLine();

            DbConnection.removeUser(nameRemove);

        } else if (selection.equalsIgnoreCase("3")) {

            DbConnection.seeUsers();

        } else {
            System.out.println("Please, Select a valid option!");
        }
    }
}