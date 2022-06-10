package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String loginId;
	private String name;
	private EmployeeType type;
	private String password;
	private boolean status;
	
	public Employee() {
		
	}

	public Employee(String loginId, String name, EmployeeType type, String password, boolean status) {
		super();
		this.loginId = loginId;
		this.name = name;
		this.type = type;
		this.password = password;
		this.status = status;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getLoginId() {
		return loginId;
	}

	public String getName() {
		return name;
	}

	public EmployeeType getType() {
		return type;
	}

	public String getPassword() {
		return password;
	}

	public boolean isStatus() {
		return status;
	}
	
}
