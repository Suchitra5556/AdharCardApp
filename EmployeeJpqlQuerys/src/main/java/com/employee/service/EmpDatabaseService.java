package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmpDatabaseService {
	
	List<Employee> getAllEmp();
	
	List<Employee> getSameAddressEmp(String address);

}
