package akshay.threadclass_method;

public class IsIntruptedMethod1 extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			System.out.println(Thread.currentThread().isInterrupted());
			for(int i=1; i<=5; i++)
			{
				System.out.println(i);
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		IsIntruptedMethod1 i = new IsIntruptedMethod1();
		i.start();
		i.interrupt();
	}

}

/*method we can use to check thread isIntrupted or not.
 * if thread isIntrupted then it will return true. and throw exception.*/
