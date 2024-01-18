package com.employee.Repository;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmployeeNamedRepo extends JpaRepository<Employee, Integer>{
	
	//Note:
	//	1. If written Query above the function returns only one row data.(not multiple row data) In this senario list is not required.
	//then function return type should be class name.
	/*2. If we want to retrive multipale column from table then return type should be OBJECT.
	 * 3. If we want to retrive multipale column from table then Query returns more than one rows then return type should be list of OBJ.
	 * List<Object[]>
	 * If we want to return only one column value then we have to give the column dataType
	 * ex: String name; return type = String.
	 * A. fetch all columns -> return Type ClassType
	 * B. fetch one Col -> return Type = Data Type
	 * c. fetch multipale col(not all col) -> return Type Object[].
	 * 
	 */
	
	
	
	@Query("select e from Employee e where  e.salary = :salary")
	List<Employee> findBySalary(Long salary);
	
	
	@Query("select e from Employee e where e.name =:name or e.address=:address")
	List<Employee> findByNameOrAddress(String name, String address);
	
	
	@Query("select e from Employee e where e.id =:id and e.name=:name")
	Employee findByIdAndName(Integer id, String name);
	
	@Query("select e from Employee e where e.name =:name and e.address=:address")
	List<Employee> findByAddressAndNameUnOrder(String address, String name);
	
	@Query("select e from Employee e where e.name =:empname and e.address=:empaddress")
	Employee findByIdAndNameDetailsVarDiff(@Param("empaddress") String empaddress,@Param("empname") String empname);
	
	@Query("select e.salary from Employee e where e.name =:name ")
	//select salary from emp whr name = ?
	Long findBySalary(String name);
	
	@Query("select e.id ,e.name,e.salary from Employee e where e.address = :address")
	List<Object[]> findByAddress(String address);
	
	
	@Query("select e from Employee e where e.id = :id")
	List<Employee> findByEmpId(Integer id);
	
	
	
	
	
	
	
	

}
