package akshay.ravi_sir_program;

class Bank
{
	private double balance = 30000;
	
	
	public synchronized void withdrow(double withdrowAmt) 
	{
		String name = Thread.currentThread().getName();
		
		if(withdrowAmt <= balance )
		{
			System.out.println(withdrowAmt + " Amount Is Withdrow By "+name);
			balance = balance - withdrowAmt;
			System.out.println("Current Balance Is " + balance);
 		}
		else
		{
			System.out.println("Sorry...! " + name + " You Have Insufficient Balance.");
		}
		
	}
	
}
	
public class SynchronizationDemo3 extends Thread
{
	static Bank bank;
	double amount;
	
	public SynchronizationDemo3(double amount) 
	{
		this.amount = amount;
		
	}
	@Override
	public void run() 
	{
		bank.withdrow(amount);
	}
	
	public static void main(String[] args) 
	{
		bank = new Bank();
		SynchronizationDemo3 t1 = new SynchronizationDemo3(20000);
		SynchronizationDemo3 t2 = new SynchronizationDemo3(15000);
		
		t1.setName("Akshay");
		t2.setName("Ravi");
		
		t1.start();
		t2.start();
	}
	
}


