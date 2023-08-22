package com.xworkz.bike.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bike.app.Service;

@Configuration
@ComponentScan("com.xworkz.bike")
public class BikeConfig {
	
	@Bean
	public Service getService() {
	
		return new Service();
	}
	
	

}
