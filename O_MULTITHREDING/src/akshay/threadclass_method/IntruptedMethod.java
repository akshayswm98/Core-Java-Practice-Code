package akshay.threadclass_method;

public class IntruptedMethod extends Thread 
{
	@Override
	public void run() 
	{
		try
		{
			System.out.println(Thread.interrupted());
			for(int i=1; i<=5; i++)
			{
				System.out.println(i);
				thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		IntruptedMethod i = new IntruptedMethod();
		i.start();
		i.interrupt();
	}

}
/*method we will use to check the thread are intrupted or not.
 * it will return true and converting false and execution of thread is normal flow*/

