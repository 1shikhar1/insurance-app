package com.monocept.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MasterTransaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Timestamp time;
	private String description;
	private double amount;
	private String type;
	
	public MasterTransaction() {
		
	}
	
	public MasterTransaction(int id, Timestamp time, String description, double amount, String type) {
		super();
		this.id = id;
		this.time = time;
		this.description = description;
		this.amount = amount;
		this.type = type;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public Timestamp getTime() {
		return time;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}
	
}
