import com.google.gson.annotations.SerializedName;

public class FindMovie {
    @SerializedName("Title")
    private final String name;

    @SerializedName("Year")
    private final String year;

    @SerializedName("Genre")
    private final String genre;

    @SerializedName("Runtime")
    private final String runtime;

    @SerializedName("Response")
    private String response;

    FindMovie(String name, String year, String genre, String runtime) {
            this.name = name;
            this.year = year;
            this.genre = genre;
            this.runtime = runtime;
    }

    public String getName() {
        return "Title: " + name;
    }

    public String getYear() {
        return "Year: " + year;
    }

    public String getGenre() {
        return "Genre: " + genre;
    }

    public String getRuntime() {
        return "Duration: " + runtime;
    }
}
