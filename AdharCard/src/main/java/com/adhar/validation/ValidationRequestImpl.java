package com.adhar.validation;

import com.adhar.Exception.Validation.ServiceValidator;
import com.adhar.entity.AdharEntity;

public class ValidationRequestImpl implements ValidationRequest{

	@Override
	public void valid(AdharEntity adharEntity) {
		
		if(adharEntity.getFirstName()==null || adharEntity.getFirstName().isEmpty())
		{
			throw new ServiceValidator("800", "Name should not be null or empty");
		}
		else if(adharEntity.getLastName()==null || adharEntity.getLastName().isEmpty())
		{
			throw new ServiceValidator("800", "LastName should not be null or empty");
		}
	}
	
	
	

}
