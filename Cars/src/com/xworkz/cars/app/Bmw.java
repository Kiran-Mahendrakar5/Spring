package com.xworkz.cars.app;

import org.springframework.stereotype.Component;

@Component
public class Bmw implements CarsInterface{

	@Override
	public void driving() {
		System.out.println("BMW keep calm and drive safe");
		
	}

}
