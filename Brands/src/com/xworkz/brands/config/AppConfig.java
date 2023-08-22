package com.xworkz.brands.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.brands.app.Adidas;
import com.xworkz.brands.app.Apple;
import com.xworkz.brands.app.Crocs;
import com.xworkz.brands.app.Fasttract;
import com.xworkz.brands.app.Nike;
import com.xworkz.brands.app.Puma;
import com.xworkz.brands.app.Rado;
import com.xworkz.brands.app.Sonata;
import com.xworkz.brands.app.Sony;
import com.xworkz.brands.app.Wildcraft;

@Configuration
public class AppConfig {
	
	@Bean
	public Adidas getAdidas() {
		System.out.println("first bean");
		return new Adidas();
	}
	@Bean
	public Apple getApple() {
		return new Apple();
	}
	@Bean
	public Crocs getCrocs() {
		return new Crocs();
	}
	@Bean
	public Fasttract getFasttract() {
		return new Fasttract();
	}
	@Bean
	public Nike getNike() {
		return new Nike();
	}
	@Bean
	public Puma getPuma() {
		return new Puma();
	}
	@Bean
	public Rado getRado() {
		return new Rado();
	}
	@Bean
	public Sonata getSonata() {
		return new Sonata();
	}
	@Bean
	public Sony getSony() {
		return new Sony();
	}
	@Bean
	public Wildcraft getWildcraft() {
		return new Wildcraft();
	}

}
