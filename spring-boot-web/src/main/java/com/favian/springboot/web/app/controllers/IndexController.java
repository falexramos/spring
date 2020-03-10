package com.favian.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index","/","","/home"})
	public String Index(Model model) {
		model.addAttribute("titulo","hola spring framework");
		return "index";
	}
	
	
}
