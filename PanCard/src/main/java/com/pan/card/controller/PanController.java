package com.pan.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pan.card.entity.PanCard;
import com.pan.card.serviceImplementation.PanCardServiceImplementation;

@RestController
@RequestMapping("/pan")
public class PanController 
{
	@Autowired
	private PanCardServiceImplementation panCardServiceImplementation;
	
	@PostMapping("/save")
	public PanCard saveUsers(@RequestBody PanCard panCard)
	{
		return panCardServiceImplementation.saveusers(panCard);
	}
	
	@GetMapping("/getBy/{cardNumber}")
    List<PanCard> findByCard(@PathVariable String cardNumber) {
		
		List<PanCard> list = panCardServiceImplementation.findByCard(cardNumber);
		return list;
	}
//	@DeleteMapping("/delete/{cardNumber}")
//	public void deletePanCardByCardNumber(@PathVariable String cardNumber )
//	{
//	  panCardServiceImplementation.deletePanCardByCardNumber(cardNumber);
//	}

	
}
