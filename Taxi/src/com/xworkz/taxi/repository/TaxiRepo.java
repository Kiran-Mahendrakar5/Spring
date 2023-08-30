package com.xworkz.taxi.repository;

import java.util.List;

import com.xworkz.taxi.dto.TaxiDto;

public interface TaxiRepo {
	
	
	public boolean saveTaxi(TaxiDto dto);
	
	public List<TaxiDto> readAll();
	
	public boolean updatebyearning(int earning);
	
	public boolean updateisAvailableById(int id,boolean isAvailable);
	
	public TaxiDto findtaxinoBylocation(String location,int taxino);
	
	public List<TaxiDto> findByisAvailable(boolean b);

}
