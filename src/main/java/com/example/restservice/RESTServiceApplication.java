package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //this annotation is a shortcut for @configuration @EnableAutoConfiguration @ComponentSCan
public class RESTServiceApplication {
//the main method uses springapplication.run() method to launch app
	public static void main(String[] args) {
		SpringApplication.run(RESTServiceApplication.class, args);
	}

}
