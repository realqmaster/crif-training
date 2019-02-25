package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample-client")
public class PublicController {

	@Autowired
	private SampleApiClient client;
	
	@GetMapping("remote-hello")
	public String sayHello(@RequestParam("name") String name) {
		return client.getHello(name);
	}

}
