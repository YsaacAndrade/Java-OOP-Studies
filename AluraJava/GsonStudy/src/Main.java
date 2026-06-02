import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();
        String key = "your api key";

        System.out.print("What's the movie name? ");
        String name = scanner.nextLine().toLowerCase();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=" + name + "&apikey=" + key))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


            String json = response.body();
            FindMovie finder = gson.fromJson(json, FindMovie.class);

            System.out.println(finder.getName());
            System.out.println(finder.getYear());
            System.out.println(finder.getGenre());
            System.out.println(finder.getRuntime());
    }
}