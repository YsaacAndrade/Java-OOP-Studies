import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private ArrayList<String> shelf = new ArrayList<String>();

    Library(ArrayList<String> shelf) {
        this.shelf = shelf;
    }

    ArrayList<String> show(String[] books) {
        shelf.addAll(Arrays.asList(books));
        return shelf;
    }

}
