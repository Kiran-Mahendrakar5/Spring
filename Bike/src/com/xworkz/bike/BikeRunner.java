package com.xworkz.bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bike.app.BikeInteface;
import com.xworkz.bike.app.KTM;
import com.xworkz.bike.app.RE;
import com.xworkz.bike.app.Service;
import com.xworkz.bike.config.BikeConfig;

public class BikeRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BikeConfig.class);

//		BikeInteface bike = context.getBean(RE.class);
//		bike.racing();
		
		Service service=  context.getBean(Service.class);
		 service.getting();
		 
		
		
 
	}

}
