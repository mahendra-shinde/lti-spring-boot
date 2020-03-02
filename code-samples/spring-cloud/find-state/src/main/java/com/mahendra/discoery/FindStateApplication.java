package com.mahendra.discoery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FindStateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindStateApplication.class, args);
	}

}
