package akshay.threadclass_method;


public class JoinMethod1 extends Thread
{
	static Thread m;
	@Override
	public void run() 
	{
		try
		{
			m.join();
			for(int i=1; i<=5; i++)
			{
				System.out.println("Child Thread "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		m = Thread.currentThread();
		JoinMethod1 j = new JoinMethod1();
		j.start();
		
		
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Main Thread "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
/*If one thread waiting for execution of another thread then, we can use join method.*/
