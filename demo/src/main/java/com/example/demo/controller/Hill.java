package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hill {
	@GetMapping("hii")
	public String hello() {
		return "hello";
	}
	

}
