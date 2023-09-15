package com.serviceregistry.user_serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UserServiceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceregistryApplication.class, args);
	}

}
