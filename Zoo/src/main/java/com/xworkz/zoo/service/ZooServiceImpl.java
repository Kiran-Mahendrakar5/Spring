package com.xworkz.zoo.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class ZooServiceImpl implements ZooService {

	@Override
	public boolean validate(String userName, String email, String passward, Model model) {
		if(userName!=null && email!=null && passward!=null) {
			if(userName.length()>=4 && !userName.isEmpty()) {
				if(email.length()>=4 && !email.isEmpty()) {
					if(passward.length()>=8 && !userName.isEmpty()) {
						System.out.println("data is valid");
						return true;
						
					}
					model.addAttribute("isPasswardValid", "Password is not valid");
					System.out.println("passward is not valid");
					return false;
					
				}
				model.addAttribute("isemailValid", "email is not valid");
				System.out.println("email is not valid");
				return false;
				
			}
			model.addAttribute("isuserNameValid", "userName is not valid");
			System.out.println("userName is not valid");
			return false;
		}
		return false;
	}

}
