package com.springboot.myproject.controller;

import org.springframework.web.mind.annotation.GetMapping;
import org.springframework.web.mind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("/test")
	public String test() {
		return "works!!"'
	}

}
