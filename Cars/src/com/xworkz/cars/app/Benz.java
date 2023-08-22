package com.xworkz.cars.app;

import org.springframework.stereotype.Component;

@Component
public class Benz implements CarsInterface{

	@Override
	public void driving() {
		System.out.println("Benz keep calm and drive safe");
		
	}

}
