package com.practice.relatime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class PracticeController {

	@GetMapping("/getMes")
	public String getMessage()
	{
		System.out.println("Hi This Message From Spring Boot Practice Project");

		return "Hi Message From Spring Boot";
	}
}
