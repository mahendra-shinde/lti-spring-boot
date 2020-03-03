package com.mahendra.configsrv.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RefreshScope
@RequestMapping("/")
public class HelloController {

	@Value("${message}")
	private String message;
	
	@GetMapping
	public String sayItOut() {
		return "The Message received was: "+message;
	}
}
