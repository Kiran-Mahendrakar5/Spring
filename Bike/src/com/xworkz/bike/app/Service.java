package com.xworkz.bike.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
 
public class Service {
	
	
	@Autowired
	@Qualifier("RE")

	 private BikeInteface biking;
	
	@Autowired
	@Qualifier("Ola")
	private ElectricBikeInteface ref2;
	
	
public void getting() {
	System.out.println("method service");
	biking.racing();
	ref2.ElectricBike();
	
       
	
	
}
//		
//	}
 
		
	
	
	

}
