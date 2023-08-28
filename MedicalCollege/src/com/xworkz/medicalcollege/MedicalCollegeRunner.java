package com.xworkz.medicalcollege;

import java.util.Arrays;
import java.util.List;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.medicalcollege.config.MedicalCollegeConfig;
import com.xworkz.medicalcollege.dto.MedicalCollegeDto;
import com.xworkz.medicalcollege.service.MedicalCollegeService;
import com.xworkz.medicalcollege.service.MedicalCollegeServiceImpl;

public class MedicalCollegeRunner {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Sudhama Nagar", "matthikere");

		MedicalCollegeDto dto = new MedicalCollegeDto(1, "BMC", 4.9f, list);
		MedicalCollegeDto dto1 = new MedicalCollegeDto(2, "msramaiya", 4.8f, list);
		MedicalCollegeDto dto2 = new MedicalCollegeDto(3, "kempegowga", 4.7f, list);

		ApplicationContext context = new AnnotationConfigApplicationContext(MedicalCollegeConfig.class);
		MedicalCollegeService service = new MedicalCollegeServiceImpl();
		MedicalCollegeService ser = context.getBean(MedicalCollegeService.class);
		ser.save(dto);
		ser.save(dto1);
		ser.save(dto2);

		ser.updateRatingByMedicalCollegeName("kempegowga", 4.6f);

		boolean delete = ser.deleteById(1);
		System.out.println(delete);

		List<MedicalCollegeDto> list1 = ser.readAll();
		list1.forEach((ref) -> {
			System.out.println(ref);
		});

	}

}
