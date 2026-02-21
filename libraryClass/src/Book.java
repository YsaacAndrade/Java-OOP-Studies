public class Book {

    private String title;
    private String author;
    private Boolean isAvailable;

    Book(String title, String author, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }
}
