package com.pan.card.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pan.card.Repository.PanCardRepository;
import com.pan.card.entity.PanCard;
import com.pan.card.service.PanCardService;

@Service
public class PanCardServiceImplementation implements PanCardService {

	@Autowired
	private PanCardRepository panCardRepository;
	

	@Override
	public PanCard saveusers(PanCard panCard)
	{
		PanCard saveduser = panCardRepository.save(panCard);
		return saveduser;
		 
	}

	@Override
	public List<PanCard> findByCard(String cardNumber) {
		
		List<PanCard> list =panCardRepository.findByCardNumber(cardNumber);
		return list;
	}

//	@Override
//	public void deletePanCardByCardNumber(String cardNumber) {
//		panCardRepository.deleteByCardNumberJPQL(cardNumber);
//		
//	}

	
	
	
	
//	@Override
//	public void deleteByCardNum(String cardNumber) {
//		
//		panCardRepository.deleteByCardNumber(cardNumber);
//	}

}
