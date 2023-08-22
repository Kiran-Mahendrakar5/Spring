package com.xworkz.bike.app;

import org.springframework.stereotype.Component;

@Component("Ola")
public class Ola implements ElectricBikeInteface {

	@Override
	public void ElectricBike() {
		System.out.println(" ola Priced on the higher side ");
		
	}

}
