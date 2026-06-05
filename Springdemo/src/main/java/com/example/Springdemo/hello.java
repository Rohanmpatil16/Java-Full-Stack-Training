package com.example.Springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@GetMapping("/hello")
	public String hell()
	{
		return "hello from spring boot !";
	}
	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome to spring boot";
	}

}
