package com.axis;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class CloudConfigClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClient1Application.class, args);
	}

}
