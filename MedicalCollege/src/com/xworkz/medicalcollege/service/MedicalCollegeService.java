package com.xworkz.medicalcollege.service;

import java.util.List;

import com.xworkz.medicalcollege.dto.MedicalCollegeDto;

public interface MedicalCollegeService {
	
	public boolean save(MedicalCollegeDto dto);
	
	public List<MedicalCollegeDto> readAll();
	
	public boolean updateRatingByMedicalCollegeName(String MedicalCollegeName,Float rating);
	
	public boolean deleteById(Integer id);
	
	

}
