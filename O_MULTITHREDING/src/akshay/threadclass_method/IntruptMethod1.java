package akshay.threadclass_method;

public class IntruptMethod1 extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println(i);
				thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		IntruptMethod1 i = new IntruptMethod1();
		i.start();
		i.interrupt();
	}

}

/*It is use for intruption and execution of thread..
 * it will only works when thread is gone in sleepin and waiting state.
 * otherwise it will execute normal forms.*/
