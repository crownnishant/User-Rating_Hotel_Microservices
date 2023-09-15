package com.lcwd.hotel.hotelmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelmicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelmicroservicesApplication.class, args);
	}

}
