package com.xworkz.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;
import com.xworkz.employee.repository.EmployeeRepo;
import com.xworkz.employee.repository.EmployeeRepoImpl;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	@Override
	public boolean save(EmployeeDto dto) {
		if (dto != null) {
			if (dto.getId() != 0) {
				if (dto.getEmployeeName() != null) {
					if (dto.getLocation() != null) {
						if (dto.getPhoneNumber() != 0) {
							if (dto.getQualification() != null) {
								if (dto.getSalary() != 0) {
									System.out.println("dto is saved");
									repo.save(dto);
									return true;

								}
								System.out.println("salary is 0");
								return false;
							}
							System.out.println("Qualification is null");
							return false;
						}
						System.out.println("pnumber is null");
						return false;
					}
					System.out.println("location is null");
					return false;
				}
				System.out.println("name is null");
				return false;
			}
			System.out.println("id is 0");
			return false;
		}
		System.out.println("name is name");
		return false;
	}

	@Override
	public EmployeeDto findByName(String name) {
		if (name != null) {
			return repo.findByName(name);

		}
		return null;
	}

	@Override
	public EmployeeDto findByNameAndLocation(String name, String location) {
		if (name != null) {
			if (location != null) {
				return repo.findByNameAndLocation(name, location);

			}
		}
		return null;
	}


	@Override
	public boolean updateNameByLoction(String name, String location) {
		if (name != null) {
			if (location != null) {
				repo.updateNameByLoction(name, location);
				return true;

			}
		}
		return false;
	}

	@Override
	public boolean deleteByName(String name) {
		if (name != null) {
			repo.deleteByName(name);
			return true;
		}
		return false;
	}

	@Override
	public List<EmployeeDto> readAll() {

		return repo.readAll();
	}

}
