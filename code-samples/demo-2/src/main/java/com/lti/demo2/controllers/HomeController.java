package com.lti.demo2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String sayHelloGet() {
		return "You have made a GET request";
	}
	@PostMapping
	public String sayHelloPost() {
		return "You have made a POST request";
	}
}
