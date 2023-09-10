package com.xworkz.zoo.service;

import org.springframework.ui.Model;

public interface ZooService {
	
	
	public boolean validate(String userName,String email,String passward,Model model);

}
