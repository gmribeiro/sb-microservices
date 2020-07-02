package com.de.sampleconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.de.sampleconsumer.web.controller"})
@EnableEurekaClient
public class SampleConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SampleConsumerApplication.class, args);
	}

}
