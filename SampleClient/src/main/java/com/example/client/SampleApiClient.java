package com.example.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sample-api")
public interface SampleApiClient {

	    @RequestMapping("sample-api/hello")
	    String getHello(@RequestParam("name") String name);

}
