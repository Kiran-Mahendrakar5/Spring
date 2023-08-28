package com.xworkz.medicalcollege.repo;

import java.util.List;

import com.xworkz.medicalcollege.dto.MedicalCollegeDto;

public interface MedicalCollegerepo {
	
	public boolean save(MedicalCollegeDto dto);
	
	public List<MedicalCollegeDto> readAll();
	
	public boolean updateRatingByMedicalCollegeName(String MedicalCollegeName,Float rating);
	
	public boolean deleteById(Integer id);
	

}
