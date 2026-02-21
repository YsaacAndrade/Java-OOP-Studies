import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Book harry = new Book("Harry Potter", "Jk", true);
        Book orwell = new Book("1984", "George Orwell", true);
        Book loveReason = new Book("Love reason", "Ali Hazelwood", false);

        Library lib = new Library(new ArrayList<String>());
        System.out.println(lib.show(new String[]{harry.getAuthor() + ": " + harry.getTitle(), orwell.getAuthor() + ": " + orwell.getTitle(), loveReason.getAuthor() + ": " + loveReason.getTitle()}));


    }
}