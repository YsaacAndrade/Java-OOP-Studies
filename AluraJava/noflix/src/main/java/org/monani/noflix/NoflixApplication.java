package org.monani.noflix;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.monani.noflix.models.Details;
import org.monani.noflix.models.Series;
import org.monani.noflix.service.APIconsume;
import org.monani.noflix.service.DataConverse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class NoflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NoflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		var consumoApi = new APIconsume();
		System.out.print("Title: ");
		String title = scanner.nextLine();
		var json = consumoApi.getJson("https://www.omdbapi.com/?t=" + title + "&apikey=5672a4fd");
		DataConverse dataConverse = new DataConverse();
		Details details = dataConverse.getData(json, Details.class);
		System.out.println(details);
	}
}
