package akshay.threadclass_method;
class Yeild extends thread
{
	@Override
	public void run() 
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(thread.currentThread().getName()+" "+i);
		}
	}
}

public class YeildMethod 
{
	public static void main(String[] args) 
	{
		Yeild y = new Yeild();
		y.start();
		
		thread.yield();

		for(int i=1; i<=5; i++)
		{
			System.out.println("Main thread "+i);
		}
	}

}

/*yield method is a static method. we can use for stop the current thread and give the chance for another thread.
 * Execution process depends on only thread scheduler.*/
 