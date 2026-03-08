package akshay.instanceofkeyword;

class Payment
{
	public void makePayment(double payment)
	{
		System.out.println("Generic Payment");
	}
}

class UPI extends Payment
{
	@Override
	public void makePayment(double payment) 
	{
		System.out.println("making payment of :"+payment+ "from UPI");
	}
	public void offer()
	{
		System.out.println("make a payment through UPI and get 100 RS cashback");
	}
}

class CreditCard extends Payment
{
	@Override
	public void makePayment(double payment) 
	{
		System.out.println("making payment of :"+payment+ "from creditcard");
	}
	public void offer()
	{
		System.out.println("make payment through credit card and get 2 days hoiday in goa");
	}
}

class DebitCard extends Payment
{
	@Override
	public void makePayment(double payment) 
	{
		System.out.println("making payment of : "+payment+ "from debit card");
	}
	public void offer()
	{
		System.out.println("make a payment through debit card and convert your emi into cost emi");
	}
}
public class InstanceOfDemo3 {

	public static void main(String[] args) 
	{
		Payment p1 = new UPI();
		paymentProcessing(p1);
		
		p1 = new CreditCard();
		paymentProcessing(p1);
		
		p1 = new DebitCard();
		paymentProcessing(p1);
	}

	private static void paymentProcessing(Payment payment) 
	{
		if(payment instanceof UPI)
		{
			UPI upi = (UPI) payment;
			upi.makePayment(15000);
			upi.offer();
		}
		
		else if(payment instanceof CreditCard)
		{
			CreditCard cc = (CreditCard) payment;
			cc.makePayment(20000);
			cc.offer();
		}
		else if(payment instanceof DebitCard card)
		{
			card.makePayment(25000);
			card.offer();
		}
	}

}
