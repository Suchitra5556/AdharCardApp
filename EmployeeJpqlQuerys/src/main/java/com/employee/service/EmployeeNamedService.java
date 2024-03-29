package com.employee.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeNotFoundByIdException;
import com.employee.exception.EmployeeNotFoundWithAddressAndNameException;
import com.employee.exception.EmployeeNotFoundWithAddressException;
import com.employee.exception.SalaryNotFoundException;

public interface EmployeeNamedService {

	List<Employee> getBySalary(Long salary);

	List<Employee> getByNameOrAddress(String name, String address);

	Employee getByIdAndName(Integer id, String name);

	List<Employee> getByAddressAndNameUnOrder(String address, String name) throws EmployeeNotFoundWithAddressAndNameException;

	Employee findByIdAndNameDetailsVarDiff(@Param("empaddress") String empaddress, @Param("empname") String empname);

	Long getBySalary(String name) throws SalaryNotFoundException;

	List<Object[]> getByAddress(String address) throws EmployeeNotFoundWithAddressException;

	List<Employee> getByEmpId(Integer id) throws EmployeeNotFoundByIdException;

}
