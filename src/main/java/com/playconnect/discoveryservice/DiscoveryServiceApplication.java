package com.playconnect.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplication {
	public static void main(String[] args) {
		try {
			// Call the method to disable SSL validation
			DisableSSLValidation.disable();
		} catch (Exception e) {
			e.printStackTrace();
		}

		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}
}
