package com.example.springclouldprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.example.controller")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringclouldProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringclouldProviderApplication.class, args);
	}

}

