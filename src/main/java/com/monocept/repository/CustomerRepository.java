package com.monocept.repository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.monocept.model.Agent;
import com.monocept.model.Customer;
import com.monocept.model.Feedback;
import com.monocept.model.InsurancePlan;
import com.monocept.model.Policy;
import com.monocept.model.dto.SendFeedBackDto;
import com.monocept.service.AgentService;
import com.monocept.service.InsuranceService;

@Repository
public class CustomerRepository {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	InsuranceService insuranceService;

	@Autowired
	AgentService agentService;

	public CustomerRepository() {

	}

	public List<Customer> getAllCustomer() {
		return em.createQuery("From Customer").getResultList();
	}

	public Customer getSingleCustomer(int id) {
		return (Customer) em.createQuery("From Customer where id= " + id + " ").getSingleResult();
	}

	@Transactional
	public Customer activateCustomer(int id) {

		Customer customer = (Customer) em.createQuery("From Customer where id= " + id + " ").getSingleResult();
		customer.setStatus(true);
		em.merge(customer);
		return customer;
	}

	@Transactional
	public Customer deactivateCustomer(int id) {

		Customer customer = (Customer) em.createQuery("From Customer where id= " + id + " ").getSingleResult();
		customer.setStatus(false);
		em.merge(customer);
		return customer;
	}

	@Transactional
	public Customer deteleCustomer(int id) {

		Customer customer = (Customer) em.createQuery("From Customer where id= " + id + " ").getSingleResult();
		customer.setDeleted(true);
		em.merge(customer);
		return customer;
	}

	@Transactional
	public Customer addCustomer(Customer customer) {
		em.persist(customer);
		return customer;

	}

	@Transactional
	public SendFeedBackDto addFeedBack(int customerId, SendFeedBackDto sendFeedback) {

		Feedback feedback = new Feedback(sendFeedback.getTitle(), sendFeedback.getMessage(),
				new java.sql.Date(new java.util.Date().getTime()));
		Customer customer = getSingleCustomer(customerId);
		feedback.setCustomer(customer);
		customer.customerAddFeedBacks(feedback);
		em.merge(customer);
		return sendFeedback;
	}


}
