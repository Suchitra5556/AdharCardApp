package com.adhar.exceptions;

public class AdharEntityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	int code;
	String errorMessage;
	
	public AdharEntityException()
	{
		
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public AdharEntityException(int code, String errorMessage) {
		super();
		this.code = code;
		this.errorMessage = errorMessage;
	}
	
	
	
	

}
