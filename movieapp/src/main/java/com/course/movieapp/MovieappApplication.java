package com.course.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.course.movieapp.model.SearchResult;
import com.course.movieapp.model.Top250Result;
import com.course.movieapp.service.MovieService;

@SpringBootApplication
public class MovieappApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MovieappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(MovieService movieService) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				
			}
		};
	}
	
	
}
