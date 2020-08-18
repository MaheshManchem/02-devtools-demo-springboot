package com.developer.devtools.rest;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRest {
	
	@GetMapping("/sayhello")
	public String sayhello() {
		return "Hi mahesh, Time to say hello:"+LocalTime.now();
	}
	
	@GetMapping("/workout")
	public String workout() {
		return "Do workout for 5k!";
	}
}