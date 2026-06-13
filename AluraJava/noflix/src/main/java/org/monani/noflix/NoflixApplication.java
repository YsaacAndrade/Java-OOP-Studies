package org.monani.noflix;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.monani.noflix.models.MovieDetails;
import org.monani.noflix.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

@SpringBootApplication
public class NoflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NoflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?i=tt3896198&apikey=5672a4fd");
	}
}
