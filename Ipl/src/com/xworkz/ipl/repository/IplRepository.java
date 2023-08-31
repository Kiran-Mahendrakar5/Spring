package com.xworkz.ipl.repository;

import java.util.List;

import com.xworkz.ipl.dto.IplDto;

public interface IplRepository {

	public boolean save(IplDto dto);
	
	public List<IplDto> findByJerseyColors(String jerseyColors);
	
	
	
	

}
