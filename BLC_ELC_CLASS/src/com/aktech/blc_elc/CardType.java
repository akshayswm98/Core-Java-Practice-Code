package com.aktech.blc_elc;

public class CardType 
{
	private Customer customer;
	private String cardType;
	
	public CardType(Customer customer,String cardType)
	{
		this.customer = customer;
		this.cardType = cardType;
	}
	
	public String toString()
	{
		return "The Customer "+this.customer+ " Is ELigible For "+this.cardType+ "Card";
	}

}
