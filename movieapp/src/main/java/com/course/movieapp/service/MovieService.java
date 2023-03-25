package com.course.movieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.course.movieapp.model.Top250Result;

@Service
public class MovieService {

	private static final String BASE_URL = "https://imdb-api.com/en/API";
	private static final String API_KEY = "k_fceb6u1k";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Top250Result getTop250() {
		return restTemplate
				.getForEntity(
						BASE_URL+"/Top250Movies/"+API_KEY, 
						Top250Result.class)
				.getBody();
	}
	
}
