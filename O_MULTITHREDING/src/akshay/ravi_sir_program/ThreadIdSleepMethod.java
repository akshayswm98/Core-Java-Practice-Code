package akshay.ravi_sir_program;

public class ThreadIdSleepMethod extends Thread
{
	@Override
	public void run() 
	{
		try
		{
			
			System.out.println("Child thread is running."+Thread.currentThread().threadId());
			Thread.sleep(2000);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				
	}
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("main thread is running "+Thread.currentThread().threadId());
		ThreadIdSleepMethod g = new ThreadIdSleepMethod();
		g.start();
		Thread.sleep(4000);
		System.out.println("main thread "+Thread.currentThread().threadId());
		
		
	}

}

/*Thread Id will use to get the id of thread.*/
