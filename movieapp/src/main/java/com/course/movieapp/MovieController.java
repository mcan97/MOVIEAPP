package com.course.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.course.movieapp.service.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public String index(ModelMap map) {
		map.addAttribute("movies", movieService.getTop250().getItems());
		map.addAttribute("errMsg", movieService.getTop250().getErrorMessage());
		return "index";
	}
	
}
