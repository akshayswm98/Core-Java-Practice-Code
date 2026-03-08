package akshay.blcelc;

import java.util.Scanner;

public class CreditCard 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Customer Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Your Credit Point :");
		int creditPoint = Integer.parseInt(sc.nextLine());
		
		Customer cust = new Customer(name, creditPoint);
		
		CardType offerCard = CardOnOffer.getOfferCard(cust);
		System.out.println(offerCard);
		sc.close();
	}

}
