package com.adhar.requestvalidation;

import com.adhar.entity.AdharEntity;
import com.adhar.exceptions.AdharEntityException;

public interface RequestValidation {
	
	public void payloadValidation(AdharEntity adharEntity) throws AdharEntityException;

}
