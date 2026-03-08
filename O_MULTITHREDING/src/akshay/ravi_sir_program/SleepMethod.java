package akshay.ravi_sir_program;

public class SleepMethod extends Thread
{
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getPriority());
		String name = Thread.currentThread().getName();
		try
		{
			for(int i = 1; i<=5; i++)
			{
				System.out.println(i+" by "+name+" thread");
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
		SleepMethod s = new SleepMethod();
		s.start();
		s.setName("Child.1");
		
		
		SleepMethod s1 = new SleepMethod();
		s1.start();
		s1.setName("Child.2");
	}

}


/*It is the predefined static method of thread class.
 * it is use to put the thread into temporarly waiting state (Time waiting)
 * it is throws check exception, intrupted exception.*/
 