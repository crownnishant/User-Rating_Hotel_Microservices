package com.lcwd.rating.user_ratingmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserRatingmicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRatingmicroservicesApplication.class, args);
	}

}
