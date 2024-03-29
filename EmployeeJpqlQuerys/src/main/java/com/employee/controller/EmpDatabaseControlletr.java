package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.serviceImpl.EmpDatabaseServiceImpl;

@RestController
@RequestMapping("/v1")
public class EmpDatabaseControlletr {
	
	@Autowired
	EmpDatabaseServiceImpl empDatabaseServiceImpl;
	
	@GetMapping("/allemp")
	public List<Employee> getAllEmp() 
	{
		List<Employee> emp = empDatabaseServiceImpl.getAllEmp();
		return emp;
	}
	@GetMapping("/allemps/{address}")
	public List<Employee> getSameAddressEmp(@PathVariable String address) 
	{
		System.out.println(address);
		List<Employee> sameAddressEmp = empDatabaseServiceImpl.getSameAddressEmp(address);
		return sameAddressEmp;
	}
	

}
