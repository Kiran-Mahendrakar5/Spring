package com.xworkz.ipl.service;

import java.util.List;

import com.xworkz.ipl.dto.IplDto;

public interface IplService {
	
	public boolean save(IplDto dto);
	
	public List<IplDto> findByJerseyColors(String jerseyColors);
	
	public boolean doExist(String JerseyColors) ;
	
	

}
