package com.lti.demo2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


///Example of Content Negotiation using Dedicated Method
///for each response type

@RestController
@RequestMapping("/index.html")
public class IndexController {

		@GetMapping(produces= "application/json")
		public String sayInJson() {
			return "{\"msg\" : \"Hello World\" }";
		}
		
		@GetMapping(produces= "application/xml")
		public String sayInXml() {
			return "<msg>Hello World</msg>";
		}
		
}
