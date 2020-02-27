package com.lti.demo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contactus")
public class ContactController {

	@GetMapping
	public String contact(Model map) {
		map.addAttribute("author","Mahendra");
		return "contact";
	}
}
