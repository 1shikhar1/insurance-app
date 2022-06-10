package com.monocept.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class InsuranceType {
	
	@Id
	private String name;
	private boolean status;
	
	@OneToMany(mappedBy = "insuranceType", cascade = CascadeType.ALL)
	private List<InsurancePlan>  insurancePlans;
	
	public InsuranceType() {
		
	}
	
	public InsuranceType(String name, boolean status) {
		super();
		this.name = name;
		this.status = status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public boolean getStatus() {
		return status;
	}
	
}
