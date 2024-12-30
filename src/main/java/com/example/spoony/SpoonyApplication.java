package com.example.spoony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpoonyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpoonyApplication.class, args);
	}

}
