package com.mahendra.configsrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableConfigServer
@EnableWebSecurity
@SpringBootApplication
public class MyConfigSrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConfigSrvApplication.class, args);
	}

}
