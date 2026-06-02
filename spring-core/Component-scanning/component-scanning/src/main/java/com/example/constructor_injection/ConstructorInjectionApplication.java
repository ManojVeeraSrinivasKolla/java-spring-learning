package com.example.constructor_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//explicitly saying to th spring too scann packages
@SpringBootApplication(
		scanBasePackages = {"com.example.constructor_injection",
		"com.example.util"}
)
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorInjectionApplication.class, args);
	}

}
