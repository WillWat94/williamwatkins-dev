package com.resumeSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {
	
	@GetMapping("")
	public String adminHome() {
		return "home";
	}
	
	@GetMapping("/projects/print3dedition")
	public String print3dEdition() {
		return "print3dEdition";
	}
}
