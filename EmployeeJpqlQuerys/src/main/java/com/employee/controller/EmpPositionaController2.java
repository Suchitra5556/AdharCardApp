package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.serviceImpl.EmployeePositionaServiceImpl;

//@RestController
//@RequestMapping("/emp")
public class EmpPositionaController2 {
	
	
	@Autowired
	EmployeePositionaServiceImpl employeePositionaServiceImpl;
	
	@PostMapping("/save")
	Employee saveemp(@RequestBody Employee emp)
	{
		return employeePositionaServiceImpl.saveEmployee(emp);
	}
	
	@PostMapping("/saveAll")
	List<Employee> savestud(@RequestBody List<Employee> emp)
	{
		return employeePositionaServiceImpl.saveEmployee(emp);
	}
	
	@GetMapping("/getAlllistOfEmp/{name}")
	public List<Employee> getAlllistOfEmp(@PathVariable String name) 
	{
		return employeePositionaServiceImpl.getAlllistOfEmp(name);
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp() 
	{
		return employeePositionaServiceImpl.getAllEmp();
	}
	@GetMapping("/byIdandName/{id}/{name}")
	public Employee getByIdAndName(@PathVariable Integer id, @PathVariable String name) 
	{
		return employeePositionaServiceImpl.getByIdAndName(id, name);
	}
	
	
	@GetMapping("/getByNameOrAddress/{name}/{address}")
	public List< Employee> getByNameOrAddress(@PathVariable String name, @PathVariable String address) 
	{
		return employeePositionaServiceImpl.getByNameOrAddress(name, address);
	}
	
	
	
	

}