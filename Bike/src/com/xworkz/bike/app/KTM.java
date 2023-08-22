package com.xworkz.bike.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KTM implements BikeInteface{
	
//	@Autowired
//	@Qualifier(value = "Ola")
//	private ElectricBikeInteface ebike;

	@Override
	public void racing() {
		System.out.println("KTM drive slowly");
//		ebike.ElectricBike();
		
	}

}
