package com.adhar.serveceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adhar.Exception.Validation.DataNotExist;
import com.adhar.Exception.Validation.ServiceValidator;
import com.adhar.entity.AdharEntity;
import com.adhar.repository.AdharRepository;
import com.adhar.service.AdharService;

@Service
public class AdharServiceImpl implements AdharService {

	final static Logger logger = LoggerFactory.getLogger(AdharEntity.class);

	@Autowired
	private AdharRepository adharrepo;

	@Override
	public AdharEntity save(AdharEntity adhar) {
		try {
			if (adhar.getFirstName() == null || adhar.getFirstName().isEmpty()) {
				throw new ServiceValidator("Please pass the value for name", "601");
			}
			AdharEntity list = adharrepo.save(adhar);
			return list;
		} catch (IllegalArgumentException e) {

			throw new ServiceValidator("Pass The Correct Data so you can save the correct Info in DB",
					"602" + e.getMessage());

		}
	}

	@Override
	public List<AdharEntity> getAll() {
		List<AdharEntity> list = adharrepo.findAll();
		return list;
	}

	@Override
	public Object getByPhnoOrAdharno(long phnoorAdhar) {
		AdharEntity adhar = new AdharEntity();
		try
		{
			if(phnoorAdhar != adhar.getAdharNo())
				throw new DataNotExist("Please Provide Valid Adhar Detail data with this adhar is not exist in DB!!");
		return adharrepo.findByPhNo(phnoorAdhar);
		}
		catch (Exception e) {
			throw new DataNotExist("data should be valid");
		}
	}

	@Override
	public Long getByAdharNo(Long adno) {
		return adharrepo.findByAdharNo(adno);
	}

	@Override
	public AdharEntity getByFirstnameAndLastname(String Firstname, String Lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdharEntity getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
