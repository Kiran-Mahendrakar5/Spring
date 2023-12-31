package com.xworkz.taxi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.taxi")
public class TaxiConfig {

	
	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {

		LocalEntityManagerFactoryBean locall = new LocalEntityManagerFactoryBean();
		locall.setPersistenceUnitName("Taxi");
		return locall;
	}

}
