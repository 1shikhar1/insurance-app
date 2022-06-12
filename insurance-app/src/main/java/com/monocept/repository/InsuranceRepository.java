package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.InsurancePlan;
import com.monocept.model.InsuranceType;

@Repository
public class InsuranceRepository {
	@PersistenceContext
	private EntityManager em;
	
	public InsuranceRepository() {
		
	}
	
	@Transactional
	public void addInsuranceType(InsuranceType type) {
		em.persist(type);
	}
	
	public List<InsuranceType> getInsuranceTypes(){
		return em.createQuery("From InsuranceType").getResultList();
	}
	
	public InsuranceType getInsuranceTypeByName(String name) {
		return (InsuranceType) em.createQuery("FROM InsuranceType WHERE name = "+name+" ").getSingleResult();
	}
	
	@Transactional
	public String activateInsuranceType(String name) {
		InsuranceType insuranceType = getInsuranceTypeByName(name);
		insuranceType.setStatus(true);
		em.merge(insuranceType);
		return "activated";
	}
	
	@Transactional
	public String deactivateInsuranceType(String name) {
		InsuranceType insuranceType = getInsuranceTypeByName(name);
		insuranceType.setStatus(false);
		em.merge(insuranceType);
		return "deactivated";
	}
	
	@Transactional
	public void addInsurancePlan(InsurancePlan plan) {
		em.persist(plan);
	}
	
	public List<InsurancePlan> getInsurancePlans(){
		return em.createQuery("From InsurancePlan").getResultList();
	}
	
	public InsurancePlan getInsurancePlanByName(String name) {
		return (InsurancePlan) em.createQuery("FROM InsurancePlan WHERE name = "+name+" ").getSingleResult();
	}
	
	@Transactional
	public String activateInsurancePlan(String name) {
		InsurancePlan insurancePlan = getInsurancePlanByName(name);
		insurancePlan.setStatus(true);
		em.merge(insurancePlan);
		return "activated";
	}
	
	@Transactional
	public String deactivateInsurancePlan(String name) {
		InsurancePlan insurancePlan = getInsurancePlanByName(name);
		insurancePlan.setStatus(false);
		em.merge(insurancePlan);
		return "deactivated";
	}
}
