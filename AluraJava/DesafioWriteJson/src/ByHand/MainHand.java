package ByHand;
import Model.CreatePerson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainHand {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            File file = new File("JsonHand.json");
            FileWriter writer = new FileWriter(file);

            System.out.print("What's your name? ");
            String name = scanner.nextLine();

            System.out.print("What's your age? ");
            String age = scanner.nextLine();

            System.out.print("Where are you from? ");
            String city = scanner.nextLine();

            CreatePerson person = new CreatePerson(name, city, age);

            writer.write("{\n" + '"'+"name"+'"'+":"+'"'+person.getName()+'"'+",\n"+'"'+"age"+'"'+":"+'"'+person.getAge()+'"'+",\n"+'"'+"city"+'"'+":"+'"'+person.getCity()+'"'+"\n}");
            writer.close();


        } catch (IOException e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("Program finalized without any errors!");
        }
    }
}