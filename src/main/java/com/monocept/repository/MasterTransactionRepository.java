package com.monocept.repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.MasterTransaction;

@Repository
public class MasterTransactionRepository {

	@PersistenceContext
	private EntityManager em;

	public MasterTransactionRepository() {

	}

	@Transactional
	public String addTransaction(MasterTransaction transaction) {
		Date date = new Date();
		Timestamp time = new Timestamp(date.getTime());
		transaction.setTime(time);
		System.err.println(time);
		em.persist(transaction);
		return "Transaction Added";
	}
	public List<MasterTransaction> getAllMasterTransaction(){
		return em.createQuery("From MasterTransaction").getResultList();
		
	}
}
