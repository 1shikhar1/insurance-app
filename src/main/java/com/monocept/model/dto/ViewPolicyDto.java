package com.monocept.model.dto;

import java.sql.Timestamp;

public class ViewPolicyDto {
	
	private int id;
	private String insuranceType;
	private String insurancePlan;
	private Timestamp createdDate;
	private Timestamp maturityDate;
	private String premiumType;
	private double premiumAmount;
	private double profitRatio;
	private double sumAssured;
	
	public ViewPolicyDto(int id, String insuranceType, String insurancePlan, Timestamp createdDate,
			Timestamp maturityDate, String premiumType, double premiumAmount, double profitRatio, double sumAssured) {
		super();
		this.id = id;
		this.insuranceType = insuranceType;
		this.insurancePlan = insurancePlan;
		this.createdDate = createdDate;
		this.maturityDate = maturityDate;
		this.premiumType = premiumType;
		this.premiumAmount = premiumAmount;
		this.profitRatio = profitRatio;
		this.sumAssured = sumAssured;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(String insurancePlan) {
		this.insurancePlan = insurancePlan;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Timestamp maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public double getProfitRatio() {
		return profitRatio;
	}

	public void setProfitRatio(double profitRatio) {
		this.profitRatio = profitRatio;
	}

	public double getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	
	
}
