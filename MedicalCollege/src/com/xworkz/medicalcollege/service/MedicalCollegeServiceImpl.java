package com.xworkz.medicalcollege.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.medicalcollege.dto.MedicalCollegeDto;
import com.xworkz.medicalcollege.repo.MedicalCollegeRepoImpl;
import com.xworkz.medicalcollege.repo.MedicalCollegerepo;
@Component
public class MedicalCollegeServiceImpl implements MedicalCollegeService {
	@Autowired
	private MedicalCollegerepo repo ;

	@Override
	public boolean save(MedicalCollegeDto dto) {
		repo.save(dto);
		System.out.println("saved");
		return true;
	}

	@Override
	public List<MedicalCollegeDto> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean updateRatingByMedicalCollegeName(String MedicalCollegeName, Float rating) {
		
		return repo.updateRatingByMedicalCollegeName(MedicalCollegeName, rating);
	}

	@Override
	public boolean deleteById(Integer id) {
		
		return repo.deleteById(id);
	}

	

}
