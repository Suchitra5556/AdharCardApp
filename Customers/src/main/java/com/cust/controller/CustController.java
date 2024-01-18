package com.cust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustController {
	
	@Autowired
	RestTemplate resttemplet;
	
	@GetMapping("/getcust")
	public String cust()
	
	{
		
		
		String  address= resttemplet.getForObject("http://localhost:8082/getadd", String.class); 
		return "I am the no one cust Name:Suchitra Khandale"+address;
	}

}
