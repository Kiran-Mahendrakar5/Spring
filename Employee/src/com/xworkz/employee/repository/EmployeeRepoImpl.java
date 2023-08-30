package com.xworkz.employee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.xworkz.employee.dto.EmployeeDto;

@Component
public class EmployeeRepoImpl implements EmployeeRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Employee");

	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(EmployeeDto dto) {

		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		em.persist(dto);
		transtion.commit();
		em.close();

		return true;

	}

	@Override
	public EmployeeDto findByName(String name) {
		TypedQuery<EmployeeDto> quary = em.createNamedQuery("findByName", EmployeeDto.class);
		quary.setParameter("nm", name);
		EmployeeDto dto = quary.getSingleResult();
		return dto;
	}

	@Override
	public EmployeeDto findByNameAndLocation(String name, String location) {
		TypedQuery<EmployeeDto> quary =	em.createNamedQuery("findByNameAndLocation", EmployeeDto.class);
		quary.setParameter("name", name).setParameter("lc", location);
		EmployeeDto dto = quary.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateNameByLoction(String name, String location) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		Query quary =	em.createNamedQuery("updateNameByLoction");
		quary.setParameter("name", name).setParameter("ln", location);
		quary.executeUpdate();
		transtion.commit();
		em.close();
		return true;
	}

	@Override
	public boolean deleteByName(String name) {
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		Query quary = em.createNamedQuery("deleted").setParameter("n", name);
		quary.executeUpdate();
	    transtion.commit();
		return true;
		
	}

	@Override
	public List<EmployeeDto> readAll() {
		Query quary = em.createNamedQuery("readAll");
		return quary.getResultList();
	}

}
