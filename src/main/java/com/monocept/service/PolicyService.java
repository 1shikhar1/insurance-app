package com.monocept.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.monocept.model.Policy;
import com.monocept.model.dto.PolicyDto;
import com.monocept.model.dto.ViewPolicyDto;
import com.monocept.repository.PolicyRepository;

@Repository
public class PolicyService {
	@Autowired
	private PolicyRepository repo;
	
	public void addPolicy(Policy policy) {
		repo.addPolicy(policy);
	}

	public List<ViewPolicyDto> getPolicies(){
		return repo.getPolicies().stream().map(p-> new ViewPolicyDto(p.getId(),p.getInsurancePlan().getInsuranceType().getName() ,p.getInsurancePlan().getName(),p.getCreatedDate(), p.getMaturityDate(),p.getPremiumType(), p.getPremiumAmount(),p.getProfitRatio(),p.getSumAssured())).collect(Collectors.toList());
	}
	
	public List<ViewPolicyDto> getPoliciesByCustomerId(int id){
		Policy p = (Policy) repo.getPoliciesByCustomerId(id);
		return (List<ViewPolicyDto>) new ViewPolicyDto(p.getId(),p.getInsurancePlan().getType() ,p.getInsurancePlan().getName(),p.getCreatedDate(), p.getMaturityDate(),p.getPremiumType(), p.getPremiumAmount(),p.getProfitRatio(),p.getSumAssured());
	}
	
	public String activatePolicy(int id) {
		return repo.activatePolicy(id);
	}
	
	public String deactivatePolicy(int id) {
		return repo.deactivatePolicy(id);
	}
	
	public String deletePolicy(int id) {
		return repo.deletePolicy(id);
	}
}
