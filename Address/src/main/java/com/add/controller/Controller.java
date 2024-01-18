package com.add.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/getadd")
	
	public String getCust()
	{
		return "Pune : 414233, Hinjewadi";
	}

}
