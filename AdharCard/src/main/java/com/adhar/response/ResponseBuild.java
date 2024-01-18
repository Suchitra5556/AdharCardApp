package com.adhar.response;

public class ResponseBuild {
	
	public static EntityResponse errorResponseBuild(int code,String message)
	{
		EntityResponse entityResponse = new EntityResponse();
		
		entityResponse.setCode(code);
		entityResponse.setMessage(message);
		
		return entityResponse;
	}

}
