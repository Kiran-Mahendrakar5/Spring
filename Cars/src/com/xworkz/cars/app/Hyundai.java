package com.xworkz.cars.app;

import org.springframework.stereotype.Component;

@Component
public class Hyundai implements CarsInterface {

	@Override
	public void driving() {
		System.out.println("HYUNDAI keep calm and drive safe");
		
	}

}
