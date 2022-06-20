package com.monocept.model.dto;

public class ReplyDto {

	private String message;

	public ReplyDto() {

	}

	public ReplyDto(String messsage) {
		this.message = messsage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
