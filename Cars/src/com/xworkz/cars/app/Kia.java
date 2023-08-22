package com.xworkz.cars.app;

import org.springframework.stereotype.Component;

@Component
public class Kia implements CarsInterface {

	@Override
	public void driving() {
		System.out.println("KIA keep calm and drive safe");
		
	}

}
