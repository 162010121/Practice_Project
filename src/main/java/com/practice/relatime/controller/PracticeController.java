package com.practice.relatime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import groovy.util.logging.Slf4j;

@RequestMapping("/practice")
@Slf4j
public class PracticeController {

	@GetMapping("/gtMessage")
	public String getMessage() {
		System.out.println("Hi This Praveen Message From Spring Boot Practice Project");

		return "Hi Message From Spring Boot";
	}
	
	@GetMapping("/getData")
	public String getData()
	{
		
		return "Hi This Message From GetData Method";
		
	}
}
