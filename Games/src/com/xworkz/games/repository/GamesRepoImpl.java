package com.xworkz.games.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.games.dto.GamesDto;

@Component
public class GamesRepoImpl implements GamesRepo{
	
@Autowired
	
	private EntityManagerFactory emf;

	@Override
	public boolean save(GamesDto dto) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transtion = em.getTransaction();
		transtion.begin();
		em.persist(dto);
		transtion.commit();
		em.close();
		return true;
		
	}

	@Override
	public GamesDto findByiplTeam(String iplTeam) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<GamesDto> query = em.createNamedQuery("findByiplTeam", GamesDto.class);
		query.setParameter("it", iplTeam);
		GamesDto dto = query.getSingleResult();
		return dto;
	}

}
