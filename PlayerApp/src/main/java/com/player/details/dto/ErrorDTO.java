package com.player.details.dto;

import org.springframework.stereotype.Component;

@Component
public class ErrorDTO {
	private int errorCode;
	private String Description;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
