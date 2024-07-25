package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningApplication {

	@GetMapping("/")
	public String getMessge() {
		return "Hello, have a nice day my friend";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

}
