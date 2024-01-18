package com.pan.card.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pan.card.entity.PanCard;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface PanCardRepository extends JpaRepository<PanCard, Integer> 

{
	public PanCard save(PanCard panCard);
	
	public  List<PanCard> findByCardNumber(String cardNumber);
	
	
	//public void delete(String cardNumber);
	
	
//	@Modifying
//	@Query(value = "Delete from PanCardE where card_number = :cardNumber", nativeQuery =true)
//	public void deleteByCardNumberJPQL(@Param("cardNumber") String cardNumber);
//	
	
	
	
	/*
	
	
//	@Modifying
//	@Query(value = "Delete from panCardE where card_number =:cardNumber", nativeQuery = true)
//	public void deleteByCardNumber(@Param("cardNumber")String cardNumber);
	
	//2nd 
	@Modifying
	    @Query(value = "delete from pan_carde where card_number = :cardNumber",nativeQuery=true)
		public void deleteByCardNumber(@Param ("cardNumber") String cardNumber);
		
		*/

	

}