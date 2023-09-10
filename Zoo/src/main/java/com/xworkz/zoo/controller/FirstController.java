package com.xworkz.zoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.zoo.service.ZooService;
import com.xworkz.zoo.service.ZooServiceImpl;

@Controller
public class FirstController {

	@Autowired
	ZooService service;

	@RequestMapping(value = "/ani", method = RequestMethod.GET)
	public String myMethod(Model model) {
		System.out.println("my method is working");
		model.addAttribute("welcome", "Welcome to zoo all..");

		return "ZooHome";

	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String mySecondMethod(@RequestParam String userName, @RequestParam String email,
			@RequestParam String passward, Model model) {

		System.out.println(userName);
		System.out.println(email);
		System.out.println(passward);

		boolean validDate = service.validate(userName, email, passward, model);
		System.out.println(validDate);

		return "ZooHome";

	}

}
