package com.favian.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContorller {

	@GetMapping("/")
	public String home() {
		
		
		return "forward:/app/index";
	}
	
	
}
