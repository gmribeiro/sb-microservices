package com.de.sampleconsumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.de.sampleconsumer.web.feign.SampleClient;

@RestController
@RequestMapping("/consume")
@EnableFeignClients(basePackages = {"com.de.sampleconsumer.web.feign"})
public class ConsumerController {
	
	@Autowired
	SampleClient sample;
	
	@GetMapping("/echo/{message}")
	public String echo(@PathVariable String message) {
		
// Also possible to call with others than feign - e.g. RestTemplate
// In this cases, the endpoint can be http://sample-service/echo/{mesage}
		return sample.echo(message);
	}
}
