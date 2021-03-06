package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample-api")
public class MyController {
	
	@GetMapping("hello")
	public String sayHello(@RequestParam("name") String name) {
		return "Hello " + name + "!";
	}

}
