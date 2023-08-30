package com.xworkz.games.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.games.dto.GamesDto;
import com.xworkz.games.repository.GamesRepo;

@Component
public class GamesServiceImpl implements GamesService {
	
	@Autowired
	private GamesRepo repo;

	@Override
	public boolean save(GamesDto dto) {
			if(dto!=null) {
				if(dto.getId()!=0) {
					if(dto.getIplTeam()!=null) {
						if(dto.getJerseyColors()!=null) {
							if(dto.getMembers()!=0) {
								if(dto.getGoal()!=null) {
									repo.save(dto);
									System.out.println("saved");
									return true;
								}
								System.out.println("goal is null");
								return false;
							}
							System.out.println("members is null");
							return false;
						}
						System.out.println("jercycolour is null");
						return false;
					}
					System.out.println("team is 0");
					return false;
				}
				System.out.println("id is 0");
				return false;
			}
			System.out.println("dto is null");
			return false;

	}

	@Override
	public GamesDto findByiplTeam(String iplTeam) {
		if(iplTeam!=null) {
			return repo.findByiplTeam(iplTeam);
	}
		return null;

	}

}