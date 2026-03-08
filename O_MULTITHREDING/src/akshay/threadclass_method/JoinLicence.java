package akshay.threadclass_method;

class Medical extends Thread
{
	@Override
	public void run() 
	{
		try 
		{	
			System.out.println("Medical Start.");
			Thread.sleep(5000);
			System.out.println("Medical Complate..");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}

class DTeast extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			System.out.println("Driving Test Start.");
			thread.sleep(3000);
			System.out.println("Driving Test Complate.");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Signature extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			System.out.println("Signature Start.");
			thread.sleep(3000);
			System.out.println("Signature Done..");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class JoinLicence 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Medical m = new Medical();
		m.start();
		
		m.join();
		
		DTeast d = new DTeast();
		d.start();
		
		d.join();
		
		Signature s = new Signature();
		s.start();
	
	}

}
