package com.lti.demo2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo2.models.Message;

@RestController
@RequestMapping("/message")
public class MsgConvertorController {

	@GetMapping(produces= {"application/json","application/xml"})
	public Message sayIt() {
		return new Message("Good Evening!");
	}
}
