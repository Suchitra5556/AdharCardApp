package com.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Repository.EmpDatabaseRepo;
import com.employee.entity.Employee;
import com.employee.service.EmpDatabaseService;

@Service
public class EmpDatabaseServiceImpl implements  EmpDatabaseService {
	
	@Autowired
	EmpDatabaseRepo databaseRepo;

	@Override
	public List<Employee> getAllEmp() {
		
		return databaseRepo.findAllEmp();
	}

	@Override
	public List<Employee> getSameAddressEmp(String address) {
		
		
		 
		List<Employee> sameAddressEmp = databaseRepo.sameAddressEmp(address);
		System.out.println("SErviceImplOPP=== "+ sameAddressEmp);
		return sameAddressEmp;
	}

}
