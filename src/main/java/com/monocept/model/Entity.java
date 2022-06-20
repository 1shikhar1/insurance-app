package com.monocept.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public class Entity {
	
	@Id
	@GeneratedValue(generator = "entity_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name="entity_seq", initialValue = 100)
	private int id;
	private boolean status = true;
	private boolean isDeleted = false;
	private String type="normal";
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Entity() {
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getId() {
		return id;
	}

	public boolean getStatus() {
		return status;
	}

	public boolean isDeleted() {
		return isDeleted;
	}
	
}
