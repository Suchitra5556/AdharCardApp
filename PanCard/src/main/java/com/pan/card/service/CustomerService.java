package com.pan.card.service;

import java.util.List;

import com.pan.card.entity.Customer;

public interface CustomerService {
	
	Customer insertCustomer(Customer customer);
	
	Customer getByMobile(Long mobile);
	
	List<Customer> findAllCustomer();
	
	List<Customer> saveMultipaleRecord(List<Customer> customer);
	
	//2
	List<Customer> getBySalary(Double salary);
	
	//3
	List<Customer> getBySalaryGreaterThan(Double salary);
	List<Customer> getBySalaryGreaterThanEqual(Double salary);
	List<Customer> getByDepartment(String department);
	
	List<Customer> getByFirstNameAndLastName(String firstName, String lastName);
	
	List<Customer> getByCountry(String country);
	
	List<Customer> getByMobileAndCountry(Long mobile, String country);
	
	List<Customer> getfindByFirstNameLike(String Firstname);
	
	List<Customer> getByFirstNameStartingWith(String Fistname);
	
	List<Customer> getByFirstNameEndingWith(String name);
	
	List<Customer> getByCountryNameNot(String countryName);

}
