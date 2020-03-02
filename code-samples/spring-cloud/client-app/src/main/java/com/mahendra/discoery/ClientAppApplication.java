package com.mahendra.discoery;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient("find-state")
public class ClientAppApplication 
	implements CommandLineRunner {

	@Bean 
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ClientAppApplication.class, args);
		
		
	}
	
	@Autowired private RestTemplate template;


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Enter State Prefix");
		Scanner sc = new Scanner(System.in);
		String prefix = sc.nextLine();
		ResponseEntity<String> result =	
					template.getForEntity("http://find-state/find/"+prefix, 
					String.class);
		System.out.println("The state name is "+result.getBody().toString());
	}

}
