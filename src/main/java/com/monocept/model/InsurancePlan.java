package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InsurancePlan {
	
	@Id
	private String name;
	
	@ManyToOne
	@JoinColumn
	private InsuranceType insuranceType;
	
	private String description;
	private int newRegistrationCommission;
	private int installmentPaymentCommission;
	private int policyTermMin;
	private int policyTermMax;
	private int minAge;
	private int maxAge;
	private double sumAssuredMin;
	private double sumAssuredMax;
	private double profitRatio;
	private boolean status;
	
	public InsurancePlan() {
		
	}

	public InsurancePlan(String name, InsuranceType insuranceType, String description, int newRegistrationCommission,
			int installmentPaymentCommission, int policyTermMin, int policyTermMax, int minAge, int maxAge,
			double sumAssuredMin, double sumAssuredMax, double profitRatio, boolean status) {
		super();
		this.name = name;
		this.insuranceType = insuranceType;
		this.description = description;
		this.newRegistrationCommission = newRegistrationCommission;
		this.installmentPaymentCommission = installmentPaymentCommission;
		this.policyTermMin = policyTermMin;
		this.policyTermMax = policyTermMax;
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.sumAssuredMin = sumAssuredMin;
		this.sumAssuredMax = sumAssuredMax;
		this.profitRatio = profitRatio;
		this.status = status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setNewRegistrationCommission(int newRegistrationCommission) {
		this.newRegistrationCommission = newRegistrationCommission;
	}

	public void setInstallmentPaymentCommission(int installmentPaymentCommission) {
		this.installmentPaymentCommission = installmentPaymentCommission;
	}

	public void setPolicyTermMin(int policyTermMin) {
		this.policyTermMin = policyTermMin;
	}

	public void setPolicyTermMax(int policyTermMax) {
		this.policyTermMax = policyTermMax;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public void setSumAssuredMin(double sumAssuredMin) {
		this.sumAssuredMin = sumAssuredMin;
	}

	public void setSumAssuredMax(double sumAssuredMax) {
		this.sumAssuredMax = sumAssuredMax;
	}

	public void setProfitRatio(double profitRatio) {
		this.profitRatio = profitRatio;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public String getDescription() {
		return description;
	}

	public int getNewRegistrationCommission() {
		return newRegistrationCommission;
	}

	public int getInstallmentPaymentCommission() {
		return installmentPaymentCommission;
	}

	public int getPolicyTermMin() {
		return policyTermMin;
	}

	public int getPolicyTermMax() {
		return policyTermMax;
	}

	public int getMinAge() {
		return minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public double getSumAssuredMin() {
		return sumAssuredMin;
	}

	public double getSumAssuredMax() {
		return sumAssuredMax;
	}

	public double getProfitRatio() {
		return profitRatio;
	}

	public boolean getStatus() {
		return status;
	}
	
}
