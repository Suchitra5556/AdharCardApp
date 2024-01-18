package com.pan.card.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pan.card.entity.Customer;
import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
	//1.Only write the new functions which are not present in JPA
	
	//--SQL Select * from customer where mobilenumber=? ------ only one
	//SELECT * FROM  pancard.customer where mobile = 555555;
	Customer findByMobile(Long mobile);
	
//2. Data
	// Select * from customer where salary >30000;
	List<Customer> findBySalary(Double salary);
	
	//3. Data
		// Select * from customer where salary >30000;
		List<Customer> findBySalaryGreaterThan(Double salary);
		
		

		//3. Data
			// Select * from customer where salary >=30000;
			List<Customer> findBySalaryGreaterThanEqual(Double salary);
			
			//4
			List<Customer> findByDepartment(String department);
			
			List<Customer> findByFirstNameAndLastName(String firstName, String lastName);
			
			List<Customer> findByCountry(String country);
			
			List<Customer> findByMobileAndCountry(Long mobile, String country);
			
			//void findByStartsWith();
			//findByRatingStartsWith(String rating);
			
			List<Customer> findByFirstNameStartingWith(String Fistname);
			
			List<Customer> findByFirstNameLike(String name);
			
			List<Customer> findByFirstNameEndingWith(String name);
			
			List<Customer> findByCountryNot(String country);
			
			
			
			
			
			
			
			
			 
			
			

	
}
