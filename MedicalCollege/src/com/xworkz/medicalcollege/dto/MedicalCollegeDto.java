package com.xworkz.medicalcollege.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class MedicalCollegeDto implements Serializable {
	
	private Integer id;
	private String MedicalCollegeName;
	private Float rating ;
	private List<String> branches;

}
