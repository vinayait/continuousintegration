package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiTestApplication.class, args);
		System.out.println("Hello CI...");
	}
}
