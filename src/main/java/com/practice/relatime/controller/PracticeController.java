package com.practice.relatime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import groovy.util.logging.Slf4j;

@RequestMapping
@Slf4j
public class PracticeController {

	@GetMapping("/gtMessa")
	public String getMessage() {
		System.out.println("Hi This Message Spring Boot Practice Project");

		return "Hi Message From Spring Boot";
	}
}
