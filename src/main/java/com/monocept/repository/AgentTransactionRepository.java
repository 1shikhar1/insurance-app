package com.monocept.repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.AgentTransaction;

@Repository
public class AgentTransactionRepository {
	@PersistenceContext
	private EntityManager em;
	
	public AgentTransactionRepository() {
		
	}

	@Transactional
	public String addTransaction(AgentTransaction transaction) {
		Date date = new Date();
		Timestamp time = new Timestamp(date.getTime());
		transaction.setTime(time);
		System.err.println(time);
		em.persist(transaction);
		return "Transaction Added";
	}
	public List<AgentTransaction> getAgentTransactions(){
		return em.createQuery("From AgentTransaction").getResultList();
		
	}

}
