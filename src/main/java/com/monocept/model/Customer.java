package com.monocept.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Customer extends com.monocept.model.Entity{

	private String name;
	private Date dob;
	private String address;
	private String city;
	private String state;
	private int pinCode;
	private String email;
	private String number;
	private String nominee;
	private String nomineeRelation;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Policy> policies;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Feedback> feedbacks;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<CustomerTransaction> transactions;
	
	
	public Customer() {
		super();
		policies = new ArrayList<>();
		feedbacks = new ArrayList<>();
		transactions = new ArrayList<>();
	}

	public Customer(String name, Date dob, String address, String city, String state, int pinCode, String email,
			String number, String nominee, String nomineeRelation) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.email = email;
		this.number = number;
		this.nominee = nominee;
		this.nomineeRelation = nomineeRelation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public String getEmail() {
		return email;
	}

	public String getNumber() {
		return number;
	}

	public String getNominee() {
		return nominee;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}
	
	public void addPolicy(Policy policy) {
		policies.add(policy);
	}
	
	public void addFeedback(Feedback feedback) {
		feedbacks.add(feedback);
	}
	
	public void addTransaction(CustomerTransaction transaction) {
		transactions.add(transaction);
	}
}
