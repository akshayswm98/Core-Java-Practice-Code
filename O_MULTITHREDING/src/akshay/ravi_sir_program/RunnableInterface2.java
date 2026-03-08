package akshay.ravi_sir_program;

public class RunnableInterface2 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread(new Runnable() 
		{
		
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println("Thread Name Is: "+name);		
			}
		});
		t.start();
	}

}
