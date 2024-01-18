package com.adhar.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.adhar.entity.AdharEntity;

public interface AdharServiceDurgesh {
	
	public AdharEntity save(AdharEntity adhar);
	public List<AdharEntity> getAll();
	public AdharEntity getById(long id);
	
    Object getByPhno(long phnoorAdhar );
	
    Long getByAdharNo(Long adno );
	
	AdharEntity getByFirstnameAndLastname(String Firstname,String Lastname);
	
	 void deleteById(Long phonNo);
	 
	 public void removeRecordByPhNo(Long phno);
	 
	 public void deleteByPhnoJPQLQ(Long phno);
	 
	 public void deleteByNum(Long phonum);
	 
	// public void deleteAdharIdUsingEntityMan(Long id);
	 
	
	


}
