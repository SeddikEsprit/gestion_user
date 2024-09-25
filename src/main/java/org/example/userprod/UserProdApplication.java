package org.example.userprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserProdApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProdApplication.class, args);
	}

}
