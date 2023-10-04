package com.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.university")
public class Universityportal1Application {

	public static void main(String[] args) {
		SpringApplication.run(Universityportal1Application.class, args);
	}

}
