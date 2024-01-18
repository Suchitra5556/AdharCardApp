package com.employee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Repository.EmpPositionalRepository;
import com.employee.entity.Employee;
import com.employee.service.EmployeePositionaService;

@Service
public class EmployeePositionaServiceImpl implements EmployeePositionaService {
	
	@Autowired
	private EmpPositionalRepository empPositionalRepository;
	
	

	@Override
	public Employee saveEmployee(Employee employee) {
		
		Employee saveemp= empPositionalRepository.save(employee);
		return saveemp;
	}

	@Override
	public List<Employee> saveEmployee(List<Employee> employee) {
		
		List<Employee> list = empPositionalRepository.saveAll(employee);
		
		return list;
		
	}

	@Override
	public List<Employee> getAlllistOfEmp(String name) {
		
		 List<Employee> alllistOfEmp = empPositionalRepository.findAlllistOfEmp(name);
		 return alllistOfEmp;
	}

	@Override
	public List<Employee> getAllEmp() {
		
		return empPositionalRepository.findAllEmp();
	}

	@Override
	public Employee getByIdAndName(Integer id, String name) {
		
		return empPositionalRepository.findByIdAndName(id, name);
	}

	@Override
	public List<Employee> getByNameOrAddress(String name, String address) {
		
		return empPositionalRepository.findByNameOrAddress(name, address);
	}

}
