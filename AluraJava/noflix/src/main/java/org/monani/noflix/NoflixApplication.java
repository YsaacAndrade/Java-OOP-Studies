package org.monani.noflix;

import org.monani.noflix.models.Details;
import org.monani.noflix.models.Series;
import org.monani.noflix.service.APIconsume;
import org.monani.noflix.service.DataConverse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

@SpringBootApplication
public class NoflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NoflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		var consumeApi = new APIconsume();
		DataConverse dataConverse = new DataConverse();

		System.out.print("Title: ");
		String title = scanner.nextLine().toLowerCase().replace(" ", "+");

		var EntireJson = consumeApi.getJson(
				"https://www.omdbapi.com/?t=" + title + "&apikey=5672a4fd"
		);
	}
}