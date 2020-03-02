package com.mahendra.discoery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/find")
public class FindStateController {

	@GetMapping("/{state}")
	public String find(@PathVariable("state") String state) {
		switch(state) {
		case "MH":
		case "mh":
			return "Maharashtra";
		case "GJ":
		case "gj":
				return "Gujrat";
		case "KA":
		case "ka":
				return "Karnataka";
		case "UP":
		case "up":
				return "Uttar Pradesh";
		case "MP":
		case "mp":
			return "Madhya Pradesh";
		}
		return "Not Found";
	}
}
