package com.xworkz.mvcintro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	
	@RequestMapping(value="/get" , method = RequestMethod.GET)
	public String  getValue() {
		System.out.println("String method");
		return "Welcome";
		
	}
	
	
	

}
