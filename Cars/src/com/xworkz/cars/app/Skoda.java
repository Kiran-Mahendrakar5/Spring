package com.xworkz.cars.app;

import org.springframework.stereotype.Component;

@Component
public class Skoda implements CarsInterface {

	@Override
	public void driving() {
		System.out.println("SKODA keep calm and drive safe");
		
	}

}
