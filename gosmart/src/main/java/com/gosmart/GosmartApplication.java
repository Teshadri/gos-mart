package com.gosmart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GosmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(GosmartApplication.class, args);
	}

}
