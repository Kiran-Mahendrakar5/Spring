package com.xworkz.bike.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RE implements BikeInteface {

//	@Autowired
//	private Ola ola;

	@Override
	public void racing() {
		System.out.println("RE drive slowly");
//		ola.ElectricBike();

	}

}
