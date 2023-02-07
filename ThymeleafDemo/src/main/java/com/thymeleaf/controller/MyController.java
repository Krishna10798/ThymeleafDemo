package com.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("inside my controller....");
		
		model.addAttribute("name","krishna");
		return "about";
	}
	
	@GetMapping("/iterator")
	public String iteraterHandler(Model m) {
		
		List<String> names=List.of("krishna","nilesh","rits","avi","vishal");
		m.addAttribute("names",names);
		return "iterate";
	}

}
