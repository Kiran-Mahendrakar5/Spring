package com.xworkz.ipl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ipl.dto.IplDto;
import com.xworkz.ipl.repository.IplRepository;

@Component
public class IplServiceImpl implements IplService {
	@Autowired
	private IplRepository repo;

	@Override
	public boolean save(IplDto dto) {
		if(!doExist(dto.getJerseyColors())){
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
		System.out.println("dto is already exist");
		return false;
		
	}

	@Override
	public List<IplDto> findByJerseyColors(String jerseyColors) {
	List<IplDto> list =	repo.findByJerseyColors(jerseyColors);
	if(list!=null) {
		return list;
		
	}
	System.out.println("list is null");
		return null;
	}

	@Override
	public boolean doExist(String JerseyColors) {
		if(findByJerseyColors(JerseyColors)!=null) {
			System.out.println("findbiipl is not null");
			return true;
		}
		
		return false;
		
	}

}
