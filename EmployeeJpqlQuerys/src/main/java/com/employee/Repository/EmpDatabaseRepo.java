package com.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.entity.Employee;

public interface EmpDatabaseRepo extends JpaRepository<Employee, Integer>
{
	@Query(value ="select * from Employee",nativeQuery = true)
	List<Employee> findAllEmp();
	
	//@Query(value ="SELECT * FROM jpqlquery.employee e where  e.emp_address = :address",nativeQuery = true)
	//@Query(value ="SELECT * FROM jpqlquery.employee e where  e.emp_address = :address",nativeQuery = true)
	//@Query(value ="SELECT * FROM jpqlquery.employee e where  e.emp_address = ?",nativeQuery = true)
	//@Query(value ="SELECT * FROM jpqlquery.employee e where  e.emp_address = ?1",nativeQuery = true)
	@Query(value ="SELECT * FROM employee  where  emp_address = ?",nativeQuery = true)
	List<Employee> sameAddressEmp(String address);

	
	
}
