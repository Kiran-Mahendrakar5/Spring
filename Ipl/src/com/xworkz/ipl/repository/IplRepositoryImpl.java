package com.xworkz.ipl.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.xworkz.ipl.dto.IplDto;

@Component
public class IplRepositoryImpl implements IplRepository {

	@Autowired
	
	private EntityManagerFactory emf;

	

	@Override
	public boolean save(IplDto dto) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		em.persist(dto);
		transtion.commit();
		em.close();
		return true;
	}

	@Override
	public List<IplDto> findByJerseyColors(String jerseyColors) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<IplDto> query = em.createNamedQuery("findByJerseyColors", IplDto.class);
		query.setParameter("jc", jerseyColors);
		List<IplDto> dto1 =	query.getResultList();
		if(!dto1.isEmpty()) {
			return dto1;
		}
		System.out.println("null value");
		return null;
	}

	

}
