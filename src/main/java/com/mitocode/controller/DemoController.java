package com.mitocode.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@SpringBootApplication
public class DemoController {

	@GetMapping("/")
	public String greeting() {		
		return "home";
	}	
}