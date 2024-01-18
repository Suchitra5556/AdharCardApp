package com.pan.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pan.card.entity.Customer;
import com.pan.card.serviceImplementation.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/v1/saverecord")
	public Customer saveCustomer(@RequestBody Customer  customer)
	{
		return customerServiceImpl.insertCustomer(customer);
	}
	
	@PostMapping("/v2/saverecord")
	public String insertCustomer(@RequestBody Customer  customer)
	{
		 Customer insertCustomer = customerServiceImpl.insertCustomer(customer);
		 return "saved";
	}
	
	@GetMapping("/v1/getByph/{mobilenumber}")
	public Customer getByMobilenumber(@PathVariable Long mobilenumber)
	{
		return customerServiceImpl.getByMobile(mobilenumber);
	}
	
	@GetMapping("v1/findAllCustomer")
	public List<Customer> getAllCustomer()
	{
		return customerServiceImpl.findAllCustomer();
	}
	
	@PostMapping("/v1/saverecordList")
	public List<Customer> saveListOfCustomers(@RequestBody List<Customer>  customer)
	{
		return customerServiceImpl.saveMultipaleRecord(customer);
	}
	@GetMapping("/v1/getBysal/{salary}")
	public List<Customer> getRecordBySalary(@PathVariable Double salary)
	{
		return customerServiceImpl.getBySalary(salary);
	}
	@GetMapping("/v1/getBySalary/{salary}")
	public List<Customer> getrecordBySalaryGreaterThan(@PathVariable Double salary) {
		
		return customerServiceImpl.getBySalaryGreaterThan(salary);
	}
	
	@GetMapping("/getbynames/{firstName}/{lastName}")
	List<Customer> getRecordByFirstNameAndLastName(@PathVariable String firstName,@PathVariable String lastName)
	{
		return customerServiceImpl.getByFirstNameAndLastName(firstName, lastName);
	}
	@GetMapping("/getbynameLike/{firstName}")
	public List<Customer> getRecordfindByFirstNameLike(@PathVariable String firstName) {
		List<Customer> list= customerServiceImpl.getfindByFirstNameLike(firstName+ "%");
		return list;
	}
	@GetMapping("/getNamenameStartWith/{firstName}")
	public List<Customer> getByFirstNameStartingWith(@PathVariable String firstName)
	{
		List<Customer> byFirstNameStartingWith = customerServiceImpl.getByFirstNameStartingWith(firstName);
		return byFirstNameStartingWith;
	}
	@GetMapping("/getNamenameEndWith/{firstName}")
	public List<Customer> getRecordByFirstNameEndingWith(@PathVariable String firstName) 
	{
		List<Customer> byFirstNameEndingWith = customerServiceImpl.getByFirstNameEndingWith(firstName);
		
		return byFirstNameEndingWith;
	}
	@GetMapping("/getCountry/{countryName}")
	public List<Customer> getByCountryNameNot(@PathVariable String countryName) 
	{
		List<Customer> byCountryNameNot = customerServiceImpl.getByCountryNameNot(countryName);
		
		return byCountryNameNot;
	}
		

	
	
	
	
	
}
