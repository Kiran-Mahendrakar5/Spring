package com.xworkz.games.service;

import com.xworkz.games.dto.GamesDto;

public interface GamesService {

	public boolean save(GamesDto dto);

	public GamesDto findByiplTeam(String iplTeam);
	
	

}
