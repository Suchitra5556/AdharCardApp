package com.adhar.service;
import java.util.List;
import java.util.Optional;

import com.adhar.entity.AdharEntity;


public interface AdharService{
	
	public AdharEntity save(AdharEntity adhar);
	public List<AdharEntity> getAll();
	public AdharEntity getById(long id);
	
    Object getByPhnoOrAdharno(long phnoorAdhar );
	
    Long getByAdharNo(Long adno );
	
	AdharEntity getByFirstnameAndLastname(String Firstname,String Lastname);
	
	

}