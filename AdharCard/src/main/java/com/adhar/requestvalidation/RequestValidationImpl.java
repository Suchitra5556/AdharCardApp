package com.adhar.requestvalidation;

import com.adhar.constant.ConstantMessage;
import com.adhar.entity.AdharEntity;
import com.adhar.exceptions.AdharEntityException;

public class RequestValidationImpl  implements RequestValidation {

	@Override
	public void payloadValidation(AdharEntity adharEntity) throws AdharEntityException 
	{
		if(adharEntity.getAdharNo()<=0)
		{
			throw new AdharEntityException(ConstantMessage.code,ConstantMessage.adharNo);
		}
		else if (adharEntity.getFirstName()==null || adharEntity.getFirstName().isEmpty())
		{
			throw new AdharEntityException(ConstantMessage.code,ConstantMessage.firstName);
		}
		else if (adharEntity.getLastName()==null || adharEntity.getLastName().isEmpty())
		{
			throw new AdharEntityException(ConstantMessage.code,ConstantMessage.lastName);
		}
		else if(adharEntity.getPhNo()<=0)
		{
			throw new AdharEntityException(ConstantMessage.code,ConstantMessage.phNo);
		}
		else if (adharEntity.getAddress()==null || adharEntity.getAddress().isEmpty())
		{
			throw new AdharEntityException(ConstantMessage.code,ConstantMessage.address);
		}
		else if (adharEntity.getState()==null || adharEntity.getState().isEmpty())
		{
			throw new AdharEntityException(ConstantMessage.code,ConstantMessage.state);
		}
		else if (adharEntity.getContry()==null || adharEntity.getContry().isEmpty())
		{
			throw new AdharEntityException(ConstantMessage.code,ConstantMessage.contry);
		}
		
		
	}

}
