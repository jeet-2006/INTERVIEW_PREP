package com.e_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EUserApplication.class, args);
	}

}
