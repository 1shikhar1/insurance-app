package com.monocept.model.dto;

public class SendPolicyDto {
	private int insurancePlanId;
	private int CustomerId;
	private int AgentId;
	private double amount;
	private int timeSpan;
	private String premiumType;

	public SendPolicyDto(int insurancePlanId, int customerId, int agentId, double amount, int timeSpan,
			String premiumType) {
		super();
		this.insurancePlanId = insurancePlanId;
		CustomerId = customerId;
		AgentId = agentId;
		this.amount = amount;
		this.timeSpan = timeSpan;
		this.premiumType = premiumType;
	}


	public SendPolicyDto(int insurancePlanId, int customerId, int agentId, double amount, int timeSpan) {
		super();
		this.insurancePlanId = insurancePlanId;
		CustomerId = customerId;
		AgentId = agentId;
		this.amount = amount;
		this.timeSpan = timeSpan;
	}


	public String getPremiumType() {
		return premiumType;
	}



	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}



	public SendPolicyDto() {
		super();

	}





	public int getTimeSpan() {
		return timeSpan;
	}



	public void setTimeSpan(int timeSpan) {
		this.timeSpan = timeSpan;
	}



	public int getInsurancePlanId() {
		return insurancePlanId;
	}

	public void setInsurancePlanId(int insurancePlanId) {
		this.insurancePlanId = insurancePlanId;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public int getAgentId() {
		return AgentId;
	}

	public void setAgentId(int agentId) {
		AgentId = agentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
