package com.xworkz.medicalcollege.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.medicalcollege.dto.MedicalCollegeDto;

@Component
public class MedicalCollegeRepoImpl implements MedicalCollegerepo {
	@Autowired
	private List<MedicalCollegeDto> list;
	
	MedicalCollegeDto dto = new MedicalCollegeDto();

	@Override
	public boolean save(MedicalCollegeDto dto) {
		list.add(dto);

		return true;
	}

	@Override
	public List<MedicalCollegeDto> readAll() {
		return list;
	}

	@Override
	public boolean updateRatingByMedicalCollegeName(String MedicalCollegeName, Float rating) {
		for(MedicalCollegeDto dtos:list) {
			if(dtos.getMedicalCollegeName().equals(MedicalCollegeName)) {
				dtos.setRating(rating);
				System.out.println("rating updatede");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(Integer id) {
		for(MedicalCollegeDto delete:list) {
			if(delete.getId().equals(id)) {
				list.remove(0);
				System.out.println("deleted");
				return true;
			}
			
		}
		return false;
	}

	

}
