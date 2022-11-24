package com.group2.finalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinalprojectApplication {

	@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})

	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}

}
