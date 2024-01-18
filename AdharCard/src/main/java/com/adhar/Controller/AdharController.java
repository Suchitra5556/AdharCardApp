package com.adhar.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adhar.Exception.Validation.ControllerValidator;
import com.adhar.Exception.Validation.DataNotExist;
import com.adhar.Exception.Validation.ServiceValidator;
import com.adhar.entity.AdharEntity;
import com.adhar.serveceImpl.AdharServiceImpl;
import com.adhar.validation.ValidationRequestImpl;

@RestController
@RequestMapping("/adhar")

public class AdharController {
	@Autowired
	AdharServiceImpl adsI;

	ValidationRequestImpl rmpl = new ValidationRequestImpl();
	
	@GetMapping("/{adno}")
      Long getByAdharNo(@PathVariable Long adno )
	{
		Long phno= adsI.getByAdharNo(adno);
		
		return phno;
	}
	

	@PostMapping("/save")

	ResponseEntity<?> save(@RequestBody AdharEntity adhar) {
		try {

			AdharEntity ae = adsI.save(adhar);
			return new ResponseEntity<AdharEntity>(ae, HttpStatus.CREATED);
		} catch (ServiceValidator e) {
			ControllerValidator cv = new ControllerValidator(e.getErrorMessage(), e.getErrorCode());
			return new ResponseEntity<ControllerValidator>(cv, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			ControllerValidator cv = new ControllerValidator("801", "something wrong");
			return new ResponseEntity<ControllerValidator>(cv, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/getAll")
	public ResponseEntity<List<AdharEntity>> getAll() {
		List<AdharEntity> list = adsI.getAll();
		return new ResponseEntity<List<AdharEntity>>(list, HttpStatusCode.valueOf(202));
	}

	@GetMapping("/v1/{phoneoradharno}")

	public Object getAdharOrPhone(@PathVariable long phoneoradharno) {
		try
		{
		return adsI.getByPhnoOrAdharno(phoneoradharno);
		}
		catch (Exception e) {
			return new DataNotExist("data not valid");
		}

	}

}
