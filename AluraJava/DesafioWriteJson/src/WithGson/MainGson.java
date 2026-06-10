package WithGson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainGson {
    public static void main(String[] args) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Scanner scanner = new Scanner(System.in);
            File file = new File("Gson.json");
            FileWriter writer = new FileWriter(file);

            System.out.print("What's your name? ");
            String name = scanner.nextLine();

            System.out.print("What's your age? ");
            String age = scanner.nextLine();

            System.out.print("Where are you from? ");
            String city = scanner.nextLine();

            CreatePerson person = new CreatePerson(name, city, age);

            writer.write(gson.toJson(person));
            writer.close();

        } catch (IOException e) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(e);
        }finally {
            System.out.println("The program has work fine! Verify the Gson.json");
        }
    }
}
