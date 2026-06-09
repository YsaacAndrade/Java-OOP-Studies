import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            File file = new File("Json.txt");
            FileWriter writer = new FileWriter(file);

            System.out.print("What's your name? ");
            String name = scanner.nextLine();

            System.out.print("What's your age? ");
            String age = scanner.nextLine();

            System.out.print("Where are you from? ");
            String city = scanner.nextLine();

            writer.write("{\n" + '"'+"name"+'"'+" : "+'"'+name+'"'+",\n"+'"'+"age"+'"'+" : "+'"'+age+'"'+",\n"+'"'+"city"+'"'+" : "+'"'+city+'"'+"\n}");
            writer.close();


        } catch (IOException e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("Program finalized without any errors!");
        }
    }
}