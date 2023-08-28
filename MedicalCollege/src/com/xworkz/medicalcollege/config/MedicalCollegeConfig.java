package com.xworkz.medicalcollege.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.medicalcollege.dto.MedicalCollegeDto;

@Configuration
@ComponentScan("com.xworkz.MedicalCollege")
public class MedicalCollegeConfig {
	@Bean
	public List<MedicalCollegeDto> getMethod(){
		return new ArrayList();
	}

}
