package akshay.blcelc;

public class CardOnOffer 
{
	public static CardType getOfferCard(Customer obj)
	{
		int creditPoint = obj.getCreditPoints();
		if(creditPoint >=100 && creditPoint <=500)
		{
			return new CardType(obj, "Slver");
		}
		else if(creditPoint >500 && creditPoint <=1000)
		{
			return new CardType(obj, "Gold");
		}
		else if(creditPoint > 1000)
		{
			return new CardType(obj, "Platinum");
		}
		else
		{
			return new CardType(obj, "EMI");
		}
	}
}
