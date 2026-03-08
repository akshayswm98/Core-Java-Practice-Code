package akshay.threadclass_method;
class Demo4 extends thread
{
	@Override
	public void run() 
	{
		for(int i = 1; i<=10; i++)
		{
			try
			{
				thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class SleepMethod2 
{
	public static void main(String[] args) 
	{
		Demo4 d = new Demo4();
		d.start();
		
	}

}
