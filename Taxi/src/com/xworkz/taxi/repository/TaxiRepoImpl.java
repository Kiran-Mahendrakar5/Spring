package com.xworkz.taxi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.taxi.dto.TaxiDto;

@Component
public class TaxiRepoImpl implements TaxiRepo {

	@Autowired
	private EntityManagerFactory emf;

	@Override
	public boolean saveTaxi(TaxiDto dto) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		em.close();

		return true;
	}

	@Override
	public List<TaxiDto> readAll() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> quary = em.createNamedQuery("readAll", TaxiDto.class);
		List<TaxiDto> list = quary.getResultList();

		return list;
	}

	@Override
	public boolean updatebyearning(int earning) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query =em.createNamedQuery("updatebyearning");
		query.setParameter("er", earning);
		query.executeUpdate();
		transaction.commit();
		em.close();
		
	
		return true;
	}

	@Override
	public boolean updateisAvailableById(int id, boolean isAvailable) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query =em.createNamedQuery("updateisAvailableById");
		query.setParameter("isA", isAvailable);
		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
		em.close();
		return true;
	}

	@Override
	public TaxiDto findtaxinoBylocation(String location, int taxino) {
		EntityManager em = emf.createEntityManager();
	TypedQuery<TaxiDto> quary =	em.createNamedQuery("findtaxinoBylocation", TaxiDto.class);
	quary.setParameter("tx", taxino);
	quary.setParameter("lc", location);
	TaxiDto dto =quary.getSingleResult();
		return dto;
	}

	@Override
	public List<TaxiDto> findByisAvailable(boolean b) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<TaxiDto> quary =	em.createNamedQuery("findByisAvailable", TaxiDto.class);
		quary.setParameter("isA", b);
		List<TaxiDto> list =(List<TaxiDto>) quary.getResultList();
		
		return list ;
	}

}
