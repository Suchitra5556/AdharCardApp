package com.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmpPositionalRepository extends JpaRepository<Employee, Integer> 
{
	//positional Query
	
	// Select * from employee;
	
	@Query("select e from Employee e where e.name = ?1")
	List<Employee> findAlllistOfEmp(String name);
	
	@Query("Select e from Employee e")
	List<Employee> findAllEmp();
	
	@Query("select e from Employee e where e.id = ?1 and e.name=?2")
	Employee findByIdAndName(Integer id ,String name);
	
	@Query("select e from Employee e where e.name =?1 or e.address =?2")
	List<Employee> findByNameOrAddress(String name , String address);
	
	
}
