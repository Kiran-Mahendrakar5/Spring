package com.xworkz.employee.service;

import java.util.List;

import com.xworkz.employee.dto.EmployeeDto;

public interface EmployeeService {
	
	public boolean save(EmployeeDto dto);
	public EmployeeDto findByName(String name);
	public EmployeeDto findByNameAndLocation(String name,String location);
	public boolean updateNameByLoction(String name,String location);
	public boolean deleteByName(String name);
	public List<EmployeeDto> readAll();
	
	
	

}
