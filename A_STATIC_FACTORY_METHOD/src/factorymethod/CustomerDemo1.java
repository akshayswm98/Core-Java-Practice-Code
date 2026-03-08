package factorymethod;

class Customer1
{
	private String customerName;
	private int creditPoint;
	
	public Customer1(String customerName, int creditPoint)
	{
		this.customerName = customerName;
		this.creditPoint = creditPoint;
	}
	
	public int getCreditPoint()
	{
		return creditPoint;
	}

	@Override
	public String toString() 
	{
		return " Customer [customerName = " + customerName + "]";
	}
	
	
}

class CardType
{
	private Customer1 customer;
	private String cardType;
	
	public CardType(Customer1 Customer, String cardType)
	{
		this.customer = Customer;
		this.cardType = cardType;
	}

	@Override
	public String toString() 
	{
		return " The customer = " + customer.toString() + ",is eligible for " + cardType + "Card";
	}
	
	
}

class CardOnOffer
{
	public static CardType getOfferedCard(Customer1 customer)
	{
		int points = customer.getCreditPoint();
		String cardType;
		
		if (points >= 1001)
		{
			cardType = "Platinum";
		}
		
		else if (points >=501 && points <= 1000)
		{
			cardType = "Gold";
		}
		
		else if (points >= 100 && points <= 500)
		{
			cardType = "Silver";
		}
		
		else {
			cardType = "EMI";
		}
		
		return new CardType(customer, cardType);
	}
}



public class CustomerDemo1 
{

	public static void main(String[] args) 
	{
		Customer1 c1 = new Customer1("Aksahy", 750);
		CardType result = CardOnOffer.getOfferedCard(c1);
		
		System.out.println(result);
	}

}
