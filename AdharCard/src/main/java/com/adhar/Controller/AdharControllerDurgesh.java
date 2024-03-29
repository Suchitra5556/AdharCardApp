package com.adhar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adhar.entity.AdharEntity;
import com.adhar.exceptions.AdharEntityException;
import com.adhar.requestvalidation.RequestValidationImpl;
import com.adhar.response.ResponseBuild;
import com.adhar.serveceImpl.AdharServiceImplDurgesh;

//  admin123 - sonarQube
@RestController
@RequestMapping("/adhar/v2")
public class AdharControllerDurgesh {
	
	@Autowired
	AdharServiceImplDurgesh adharServiceImplDurgesh;
	
	//RequestValidationImpl requestval = new RequestValidationImpl();
	
	@PostMapping("/save")
	public ResponseEntity<?> saveData(@RequestBody AdharEntity adharEntity)
	{
		try {
			//requestval.payloadValidation(adharEntity);
			new RequestValidationImpl().payloadValidation(adharEntity);
		 AdharEntity saveData = adharServiceImplDurgesh.save(adharEntity);
		 return new ResponseEntity<>(saveData,HttpStatus.CREATED);
		
		}
		catch (AdharEntityException e) {
			
			return new ResponseEntity<>(ResponseBuild.errorResponseBuild(e.getCode(), e.getErrorMessage()),HttpStatus.BAD_REQUEST);
			
		}
		catch (Exception e) {
			 e.printStackTrace();
			
		}
		return null;
		
		
	}
	
	@GetMapping("/getAll")
	public List<AdharEntity> getAll()
	{
		return adharServiceImplDurgesh.getAll();
	}
	
	@GetMapping("/byid/{id}")
	public AdharEntity getById(@PathVariable long id)
	{
		return adharServiceImplDurgesh.getById(id);
	} 
	
	@GetMapping("/bynum/{phonenumber}")
	public Object getByPhno(@PathVariable long phonenumber)
	{
		return adharServiceImplDurgesh.getByPhno(phonenumber);
	}

	@GetMapping("/byadhar/{adno}")
	public Long getByAdharNo(@PathVariable Long adno)
	{
		return (Long) adharServiceImplDurgesh.getByAdharNo(adno);
	}
	
	@GetMapping("/byname/{firstName}/{LastName}")
	public AdharEntity getByFirstAndLastName(@PathVariable String firstName ,@PathVariable String LastName)
	{
		return adharServiceImplDurgesh.getByFirstnameAndLastname(firstName, LastName);
	}
	
	@DeleteMapping("/delete/{phonenumber}")
	public void deleteByNumber(@PathVariable Long phonenumber)
	{
		adharServiceImplDurgesh.deleteById(phonenumber);
	}
	
	@DeleteMapping("/remove/{phonenumber}")
	public void removeByNumber(@PathVariable Long phonenumber)
	{
		adharServiceImplDurgesh.removeRecordByPhNo(phonenumber);
	}
	
	@DeleteMapping("/deleteby/{phonenumber}")
	public void deleteByPhno(@PathVariable Long phonenumber)
	{
		adharServiceImplDurgesh.deleteByPhnoJPQLQ(phonenumber);
	}
	
	@DeleteMapping("/deletebynum/{phonenumber}")
    public void deleteByNum(@PathVariable("phonenumber") Long phonum) {
		
	adharServiceImplDurgesh.deleteByNum(phonum);
	}
	
//	@DeleteMapping("/deletebyentity/{phonenumber}")
//	public void deleteByadharEn(@PathVariable Long )
//	{
//		adharServiceImplDurgesh.deleteByPhnoJPQLQ(adharNo);
//	}
//	
	
	

}
