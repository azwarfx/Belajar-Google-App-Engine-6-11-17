package com.kofera.app.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {
	public String hello(Model model) {
		
		model.addAttribute("name", "John Dae");
		
		return "welcome";
	}
}
