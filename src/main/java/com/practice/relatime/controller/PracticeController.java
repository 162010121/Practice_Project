package com.practice.relatime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import groovy.util.logging.Slf4j;

@RequestMapping
@Slf4j
public class PracticeController {

	@GetMapping("/getMessa")
	public String getMessage() {
		System.out.println("Hi This Message From Spring Boot Practice Project");

		return "Hi Message From Spring Boot";
	}
}
