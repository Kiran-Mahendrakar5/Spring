package com.xworkz.games.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;


@Configuration
@ComponentScan("com.xworkz.games")  
public class GamesConfig {

	
	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean local =new LocalEntityManagerFactoryBean();
		local.setPersistenceUnitName("Games");
		return local;
		
		
	}
}
