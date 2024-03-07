package com.willdev.shop.zuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServiceApplication.class, args);
	}

}
