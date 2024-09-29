package com.adnan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/api/v1/greet")
	public String greet() {
		System.out.println("hi I am a demo app for learning docker!!!!!!!!!");
		return "Hi!!!! How are you guyzzzzzzzzzzzz";
	}

}
