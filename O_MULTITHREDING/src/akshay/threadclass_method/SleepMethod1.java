package akshay.threadclass_method;


public class SleepMethod1
{
	public static void main(String[] args) 
	{
		System.out.println(thread.currentThread().getName());
		for(int i=1; i<=5; i++)
		{
			try
			{
				thread.sleep(1000);//sleep method holding a thread for some second whatever you given time
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}

/*sleep method are use for holding threads for some minute
 * it is throwing compile time exception intrupted exception.*/
