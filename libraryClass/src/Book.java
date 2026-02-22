import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private Boolean isAvailable;
    static List<Book> library = new ArrayList<>();

    public Book(String title, String author, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        library.add(this);
    }

    public static void show() {
        for (Book i : library) {
            System.out.println("Book name: " + i.title + " | Author: " + i.author + " | Is available: " + i.isAvailable);
        }
    }


}
