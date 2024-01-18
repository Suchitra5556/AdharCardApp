package com.adhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.adhar.entity.AdharEntity;

import jakarta.transaction.Transactional;


@Repository
@Transactional
public interface AdharRepository extends JpaRepository<AdharEntity, Long> 
{
	//AdharEntity findById(long id);
	//1.JPAQL query -----------------------------------------------------------------
	//@Query("Select firstName,lastName,contry from AdharEntity")
	
	// SQL DB Query-----------------------------
	
	@Query(value = "Select adhar_no,address,first_name,last_name from adhar_entity",nativeQuery=true)
	public Object findByPhNo(long phno );
	
	@Query("Select adharNo from AdharEntity")
	public Long findByAdharNo(Long adharno );
	
	public AdharEntity findByFirstNameAndLastName(String firstName,String Lastname);
	
	//@Query(value = "delete from adhar_entity where ph_no = :phNo",nativeQuery=true)
	//@Param ("phNo") Long phNo
	public void deleteByPhNo(Long phno);
	
	public void removeByPhNo(Long phno);
	
	//----- to perform DELET,PUT,INSERT we have to use two annotations @Modifying, @Transactional-------
	
	//Using JPQl
	@Modifying
	@Query("Delete from AdharEntity where phNo  = :phNo")
	public void deleteByPhnoJPQL(@Param("phNo")Long phno);
	
	@Modifying
	//@Query(value = "Select adhar_no,address,first_name,last_name from adhar_entity",nativeQuery=true)
//	@Query(value = "Delete from adhar_entity where ph_no =?1", nativeQuery = true)
//	public void deleteByNumber(Long phno);
//	
	@Query(value = "Delete from adhar_entity where ph_no =:phno", nativeQuery = true)
	public void deleteByNumber(@Param("phno")Long phno);
	

	
	
	
	
}
