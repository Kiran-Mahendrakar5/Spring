package com.xworkz.modeltwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	@RequestMapping(value = "/send",method = RequestMethod.GET)
	public String myMethod(Model model) {
		System.out.println("String method");
		if(1==1) {
			model.addAttribute("name", "kiran");
			return "Home";
		}else {
			model.addAttribute("name", "kishan");
			return "Home";
		}
		
	}
	
	
	

}
