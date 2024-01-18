package com.pan.card.service;

import java.util.List;

import com.pan.card.entity.PanCard;

public interface PanCardService {
	
	public PanCard saveusers(PanCard panCard);
	
	List<PanCard> findByCard(String cardNumber);
	
	//public void deletePanCardByCardNumber(String cardNumber);

}
