package com.xworkz.ipl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.ipl.config.IplConfig;
import com.xworkz.ipl.dto.IplDto;
import com.xworkz.ipl.service.IplService;
import com.xworkz.ipl.service.IplServiceImpl;

public class IplRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(IplConfig.class);

		IplService service = context.getBean(IplServiceImpl.class);

		IplDto dto = new IplDto(1, "Rcb", "green", 12, "Escn");
		IplDto dto1 = new IplDto(2, "delhi", "red", 13, "mscn");
		IplDto dto2 = new IplDto(3, "gujurath", "blue", 14, "winning");
		IplDto dto3 = new IplDto(4, "csk", "blue", 15, "disqualify");
		IplDto dto4 = new IplDto(5, "mumbai", "darkblue", 16, "cup");
		IplDto dto5 = new IplDto(6, "mumbai", "red", 13, "teacup");
		IplDto dto6 = new IplDto(7, "kerala", "pink", 13, "teacup");
		
		

		//service.save(dto);
   //    	service.save(dto1);
	//	service.save(dto2);
		service.save(dto3);
//		service.save(dto4);
//		service.save(dto5);
//		service.save(dto6);
		

//		IplDto find = service.findByiplTeam("Rcb");
//		System.out.println(find);
		
//		List<IplDto> list1 =service.findByJerseyColors("red");
//		list1.forEach((ref)->{System.out.println(ref);});
		

	}

}
