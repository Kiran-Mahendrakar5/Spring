package com.xworkz.bike.app;

import org.springframework.stereotype.Component;

@Component
public class Ather implements ElectricBikeInteface {

	@Override
	public void ElectricBike() {
		System.out.println(" ather Priced on the higher side ");
		
	}

}
