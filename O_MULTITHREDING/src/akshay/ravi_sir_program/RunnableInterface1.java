package akshay.ravi_sir_program;


public class RunnableInterface1 
{
	public static void main(String[] args) 
	{
		Runnable r = new Runnable() 
		{
			@Override
			public void run() 
			{
				String name = Thread.currentThread().getName();
				System.out.println("Thread Name Is : "+name);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
