package com.adhar.serveceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adhar.entity.AdharEntity;
import com.adhar.repository.AdharRepository;
import com.adhar.service.AdharServiceDurgesh;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;


@Service
public class AdharServiceImplDurgesh implements AdharServiceDurgesh {
	
	@Autowired
	AdharRepository adharRepository;
	
	@Autowired
	EntityManager entityManager;

	@Override
	public AdharEntity save(AdharEntity adhar) {
		// TODO Auto-generated method stub
		return adharRepository.save(adhar);
	}

	@Override
	public List<AdharEntity> getAll() {
		// TODO Auto-generated method stub
		return adharRepository.findAll();
	}

	@Override
	public AdharEntity getById(long id) {
		// TODO Auto-generated method stub
		return adharRepository.findById(id).get();
	}

	@Override
	public Object getByPhno(long phnoorAdhar) {
		// TODO Auto-generated method stub
		return adharRepository.findByPhNo(phnoorAdhar);
	}

	@Override
	public Long getByAdharNo(Long adno) {
		// TODO Auto-generated method stub
		return adharRepository.findByAdharNo(adno);
	}

	@Override
	public AdharEntity getByFirstnameAndLastname(String Firstname, String Lastname) {
		// TODO Auto-generated method stub
		return adharRepository.findByFirstNameAndLastName(Firstname, Lastname);
	}

	//@Override
//	public void deleteById(Long phonNo)
//	{
//		adharRepository.deleteByPhNo(phonNo);
//		
//	}
//
//	@Override
//	public void removeRecordByPhNo(Long phno) {
//		
//		adharRepository.removeByPhNo(phno);
//		
//	}

	@Override
	public void deleteByPhnoJPQLQ(Long phno) {
		
		adharRepository.deleteByPhnoJPQL(phno);
		
	}

	@Override
	public void deleteById(Long phonNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeRecordByPhNo(Long phno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByNum(Long phonum) {
		
		adharRepository.deleteByNumber(phonum);
		
	}

	

	
	

}