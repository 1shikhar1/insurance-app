package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.InsurancePlan;
import com.monocept.model.InsuranceType;
import com.monocept.repository.InsuranceRepository;

@Service
public class InsuranceService {
	@Autowired
	private InsuranceRepository repo;
	
	public InsuranceService() {
		
	}
	
	public void addInsuranceType(InsuranceType type) {
		repo.addInsuranceType(type);
	}
	
	public List<InsuranceType> getInsuranceTypes(){
		return repo.getInsuranceTypes();
	}
	
	public InsuranceType getInsuranceTypeByName(String name) {
		return repo.getInsuranceTypeByName(name);
	}
	
	public String activateInsuranceType(String name) {
		return repo.activateInsuranceType(name);
	}
	
	public String deactivateInsuranceType(String name) {
		return repo.deactivateInsuranceType(name);
	}
	
	public void addInsurancePlan(InsurancePlan plan) {
		repo.addInsurancePlan(plan);
	}
	
	public List<InsurancePlan> getInsurancePlans(){
		return repo.getInsurancePlans();
	}
	
	public InsurancePlan getInsurancePlanByName(String name) {
		return repo.getInsurancePlanByName(name);
	}
	
	public String activateInsurancePlan(String name) {
		return repo.activateInsurancePlan(name);
	}
	
	public String deactivateInsurancePlan(String name) {
		return repo.deactivateInsurancePlan(name);
	}
}
