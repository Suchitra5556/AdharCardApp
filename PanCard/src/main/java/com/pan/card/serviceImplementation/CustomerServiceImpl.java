package com.pan.card.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pan.card.Repository.CustomerRepository;
import com.pan.card.entity.Customer;
import com.pan.card.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer getByMobile(Long mobile) {
		Customer byMobile = customerRepository.findByMobile(mobile);
		return byMobile;
	}

	@Override
	public Customer insertCustomer(Customer customer) {
		Customer saveCustomer= customerRepository.save(customer);
		return saveCustomer;
	}

	@Override
	public List<Customer> findAllCustomer() {
		List<Customer> allCustomer = customerRepository.findAll();
		return allCustomer;
	}

	@Override
	public List<Customer> saveMultipaleRecord(List<Customer> customer) {
		List<Customer> saveAll = customerRepository.saveAll(customer);
		return saveAll;
	}

	@Override
	public List<Customer> getBySalary(Double salary) {
		
		return customerRepository.findBySalary(salary);
		 
	}

	@Override
	public List<Customer> getBySalaryGreaterThan(Double salary) {
		
		List<Customer> bySalaryGreaterThan = customerRepository.findBySalaryGreaterThan(salary);
		return bySalaryGreaterThan;
	}

	@Override
	public List<Customer> getBySalaryGreaterThanEqual(Double salary) {
		
	     List<Customer> bySalaryGreaterThan = customerRepository.findBySalaryGreaterThan(salary);
	     return bySalaryGreaterThan;
	}

	@Override
	public List<Customer> getByDepartment(String department) {
		
		List<Customer> byDepartment = customerRepository.findByDepartment(department);
		return byDepartment;
	}

	@Override
	public List<Customer> getByFirstNameAndLastName(String firstName, String lastName) {
		
		List<Customer> byFirstNameAndLastName = customerRepository.findByFirstNameAndLastName(firstName, lastName);
		return byFirstNameAndLastName;
	}

	@Override
	public List<Customer> getByCountry(String country) {
		
		List<Customer> byCountry = customerRepository.findByCountry(country);
		return byCountry;
	}

	@Override
	public List<Customer> getByMobileAndCountry(Long mobile, String country) {
		
		List<Customer> byMobileAndCountry = customerRepository.findByMobileAndCountry(mobile, country);
		return byMobileAndCountry;
	}

	@Override
	public List<Customer> getfindByFirstNameLike(String Firstname) {
		
		List<Customer> list = customerRepository.findByFirstNameLike(Firstname);
		return list;
	}

	@Override
	public List<Customer> getByFirstNameStartingWith(String Fistname) {
		
		List<Customer> byFirstNameStartingWith = customerRepository.findByFirstNameStartingWith(Fistname);
		return byFirstNameStartingWith;
	}

	@Override
	public List<Customer> getByFirstNameEndingWith(String name) {
		
		List<Customer> byFirstNameEndingWith = customerRepository.findByFirstNameEndingWith(name);
		return byFirstNameEndingWith;
		
	}

	@Override
	public List<Customer> getByCountryNameNot(String countryName) {
		List<Customer> byCountryNameNot = customerRepository.findByCountryNot(countryName);
		return byCountryNameNot;
	}

}
