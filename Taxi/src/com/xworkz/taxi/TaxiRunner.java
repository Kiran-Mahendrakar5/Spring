package com.xworkz.taxi;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.taxi.config.TaxiConfig;
import com.xworkz.taxi.dto.TaxiDto;
import com.xworkz.taxi.service.TaxiService;
import com.xworkz.taxi.service.TaxiServiceImpl;

public class TaxiRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(TaxiConfig.class);

		TaxiService service = context.getBean(TaxiServiceImpl.class);

		TaxiDto dto = new TaxiDto(1, 5566, 5000, 12, true, "goraguntepalya");
		TaxiDto dto1 = new TaxiDto(2, 5577, 4900, 11, true, "yeshwanthpura");
		TaxiDto dto2 = new TaxiDto(3, 7788, 4800, 10, true, "mahalakshmi");
		TaxiDto dto3 = new TaxiDto(4, 8899, 4700, 9, true, "rajajinagar");
		TaxiDto dto4 = new TaxiDto(5, 1010, 4600, 8, true, "mantrisquar");
		TaxiDto dto5 = new TaxiDto(6, 1111, 4500, 7, true, "nagasandra");

//	service.saveTaxi(dto);
//	service.saveTaxi(dto1);
//	service.saveTaxi(dto2);
//	service.saveTaxi(dto3);
//	service.saveTaxi(dto4);
//	service.saveTaxi(dto5);

		// update updatebyearning
//		boolean updatebyearning = service.updatebyearning(4500);
//		System.out.println(updatebyearning);
		


		// updateisAvailableById
		boolean updateisAvailableById =	service.updateisAvailableById(3, false);
		System.out.println(updateisAvailableById);

////		findtaxinoBylocation
//		TaxiDto findtaxinoBylocation = service.findtaxinoBylocation("rajajinagar", 8899);
//		System.out.println(findtaxinoBylocation);

//		readAll
//	List<TaxiDto>  list =service.readAll();
//	list.forEach((ref)->{System.out.println(ref);});
		
		
		//available taxies
		List<TaxiDto> finded = service.findByisAvailable(true);
		
		finded.forEach((ref)->{System.out.println(ref);});
		
		
	}

}
