package akshay.threadclass_method;


public class JoinMethod extends thread
{

	public void run() 
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Child Thread "+i);
				thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		JoinMethod j = new JoinMethod();
		j.start();
		
		j.join();
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Main Thread "+i);
				thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
/*If a thread want to wait for another thread to complate its task then we can use join.
 * Ex : licence,,,test,,medical,,signature.*/
 