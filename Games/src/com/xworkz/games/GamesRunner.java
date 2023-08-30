package com.xworkz.games;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.games.config.GamesConfig;
import com.xworkz.games.dto.GamesDto;
import com.xworkz.games.service.GamesService;
import com.xworkz.games.service.GamesServiceImpl;

public class GamesRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(GamesConfig.class);

		GamesService service = context.getBean(GamesServiceImpl.class);

		GamesDto dto = new GamesDto(1, "Rcb", "green", 12, "Escn");
		GamesDto dto1 = new GamesDto(2, "delhi", "red", 12, "mscn");
		GamesDto dto2 = new GamesDto(3, "gujurath", "blue", 12, "winning");
		GamesDto dto3 = new GamesDto(4, "csk", "yellow", 12, "disqualify");
		GamesDto dto4 = new GamesDto(5, "mumbai", "darkblue", 12, "cup");

//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);

		GamesDto find = service.findByiplTeam("Rcb");
		System.out.println(find);
	}

}
