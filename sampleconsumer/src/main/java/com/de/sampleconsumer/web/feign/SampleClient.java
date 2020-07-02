package com.de.sampleconsumer.web.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("sample-service")
public interface SampleClient {

	@GetMapping("/echo/{message}")
	public String echo(@PathVariable String message);
	
}
