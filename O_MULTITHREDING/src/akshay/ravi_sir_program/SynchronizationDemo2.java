package akshay.ravi_sir_program;

class ThreadSynchronization
{
	public synchronized void printTable(int num)
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(num+" x "+i+" = "+(num*i));
				Thread.sleep(1000);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
public class SynchronizationDemo2 
{
	public static void main(String[] args) 
	{
		ThreadSynchronization t1 = new ThreadSynchronization();
		
		  //Anonymous T2
		Thread t2 = new Thread()
		{
			@Override
			public void run()
			{
				t1.printTable(5);
			}
		};
		
		
		//Anonymous t3
		Thread t3 = new Thread()
		{
			@Override
			public void run()
			{
				t1.printTable(7);
			}
		};
		
		t2.start(); t3.start();
	}

}
