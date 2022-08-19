package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
@RequestMapping("/api")
@PropertySource({"classpath:${spring.profiles.active}/config.properties"})
public class TestController {
	
	@Value("${test.config}")
	String config;
	
	
	@RequestMapping("/test")
	public String test() throws Exception{
		System.out.println("================== : " +config);
		
		return "test";
	}
}
