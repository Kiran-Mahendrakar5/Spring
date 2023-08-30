package com.xworkz.employee.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.sun.xml.bind.v2.runtime.Name;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee_table")
@NamedQuery(name = "findByName", query = "select dto from EmployeeDto dto where dto.employeeName=:nm")
@NamedQuery(name = "findByNameAndLocation", query = "select dto from EmployeeDto dto where dto.employeeName=:name and dto.location=:lc")
@NamedQuery(name = "updateNameByLoction", query = "update EmployeeDto dto set dto.employeeName=:name where dto.location=:ln")
@NamedQuery(name = "deleted", query ="delete from EmployeeDto dto where dto.employeeName=:n")
@NamedQuery(name ="readAll",query = "select dto from EmployeeDto dto")
public class EmployeeDto implements Serializable {

	@Id
	private int id;
	private String employeeName;
	private String location;
	private String qualification;
	private int salary;
	private long phoneNumber;

}
