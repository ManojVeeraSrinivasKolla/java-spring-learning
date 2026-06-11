package com.springBoot.hibernate_JPA_CRUD;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateJpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return runner -> {
			System.out.println("hello world");
		};
	}
}