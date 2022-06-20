package com.monocept.repository;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.CustomerTransaction;
import java.util.Date;

@Repository
	public class CustomerTransactionRepository {

		@PersistenceContext
		private EntityManager em;
		
		public CustomerTransactionRepository() {
			
		}

		@Transactional
		public String addTransaction(CustomerTransaction transaction) {
			Date date = new Date();
			Timestamp time = new Timestamp(date.getTime());
			transaction.setTime(time);
			System.err.println(time);
			em.persist(transaction);
			return "Transaction Added";
		}
		public List<CustomerTransaction> getCustomerTransactions(){
			return em.createQuery("From CustomerTransaction").getResultList();
			
		}
	}

