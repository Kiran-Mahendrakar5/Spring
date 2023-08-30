package com.xworkz.employee;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.employee.config.EmployeeConfig;
import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.service.EmployeeService;
import com.xworkz.employee.service.EmployeeServiceImpl;

public class EmployeeRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeService service = context.getBean(EmployeeServiceImpl.class);

		EmployeeDto dto = new EmployeeDto(6, "varun", "koymatthur", "BE", 52000, 9878789809l);

//		service.save(dto);

//		EmployeeDto find =	service.findByName("ulage");
//		System.out.println(find);

//		EmployeeDto find = service.findByNameAndLocation("shuheb", "tamilnadu");
//		System.out.println(find);

//		boolean result = service.updateNameByLoction("varuna", "koymatthur");
//		System.out.println(result);
		
//		boolean result =service.deleteByName("kishan");
//		System.out.println(result);
		
		List<EmployeeDto> list =	service.readAll();
		list.forEach((ref)->{System.out.println(ref);});

	}

}
