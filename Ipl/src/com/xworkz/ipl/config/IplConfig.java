package com.xworkz.ipl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.ipl")    
public class IplConfig {

	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean local =new LocalEntityManagerFactoryBean();
		local.setPersistenceUnitName("Ipl");
		return local;
		
		
	}
}
