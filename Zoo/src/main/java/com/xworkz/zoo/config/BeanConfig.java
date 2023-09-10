package com.xworkz.zoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
@Configuration
@ComponentScan("com.xworkz.zoo")
public class BeanConfig implements WebMvcConfigurer {
	
	public BeanConfig() {
		System.out.println("Bean config");
	}
	@Bean
	public ViewResolver viewResolver() {
		return new  InternalResourceViewResolver("/WEB-INF/",".jsp");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "ZooHome.jsp");
	}

}
