package com.xworkz.games.repository;

import com.xworkz.games.dto.GamesDto;

public interface GamesRepo {
	
	public boolean save(GamesDto dto);

	public GamesDto findByiplTeam(String iplTeam);

}
