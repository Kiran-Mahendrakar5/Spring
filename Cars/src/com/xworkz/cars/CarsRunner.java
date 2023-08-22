package com.xworkz.cars;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.cars.app.Benz;
import com.xworkz.cars.app.Bmw;
import com.xworkz.cars.app.CarsInterface;
import com.xworkz.cars.app.Hyundai;
import com.xworkz.cars.app.Kia;
import com.xworkz.cars.app.Skoda;
import com.xworkz.cars.config.CarsConfig;

public class CarsRunner {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarsConfig.class);
		
		CarsInterface car = context.getBean(Bmw.class);
		car.driving();
		
		CarsInterface car1 = context.getBean(Benz.class);
		car1.driving();
		
		CarsInterface car2 = context.getBean(Hyundai.class);
		car2.driving();
		
		
		CarsInterface car3 = context.getBean(Kia.class);
		car3.driving();
		
		
		CarsInterface car4 = context.getBean(Skoda.class);
		car4.driving();
		
	}

}
