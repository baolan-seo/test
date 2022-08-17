package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class TestController {
	
	@Value("${test.config}")
	String config;
	
	
	@RequestMapping("/test")
	public String test() {
		System.out.print("================== : " + config);
		
		return "test~";
	}
}
