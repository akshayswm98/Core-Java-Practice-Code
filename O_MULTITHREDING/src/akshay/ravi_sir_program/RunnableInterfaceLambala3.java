package akshay.ravi_sir_program;

public class RunnableInterfaceLambala3 
{
	public static void main(String[] args) 
	{
		Runnable r = () ->
		{
			String name = Thread.currentThread().getName();
			System.out.println("Thread Name: "+name);
		};
		Thread t = new Thread(r);
		t.start();
	}

}
