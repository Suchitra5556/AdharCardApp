package com.adhar.Exception.Validation;

import org.springframework.stereotype.Component;

@Component
public class ServiceValidator extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String errorMessage;
	String errorCode;
	
	public ServiceValidator() 
	{
	
	}
	
	
	public ServiceValidator(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public String getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//	
//	
//	
	
	
	
	
	

}
