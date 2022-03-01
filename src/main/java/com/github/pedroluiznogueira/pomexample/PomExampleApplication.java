package com.github.pedroluiznogueira.pomexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PomExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PomExampleApplication.class, args);
		System.out.println("Running...");
	}

}
