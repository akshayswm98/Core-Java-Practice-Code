package akshay.threadclass_method;

class Counter extends thread
{
	int total = 0;// output show before for loop execution.
	@Override
	public void run() 
	{
		
			for(int i=1; i<=10; i++)
			{
				total = total+100;
			}
		//it will take time for execution.
	}
}

public class WaitMethod6
{
	public static void main(String[] args) throws InterruptedException 
	{
		Counter c = new Counter();
		c.start();
		
		System.out.println("Total value is : "+ c.total+" :- "+c.currentThread().getName()); // these line print early.
	}

}

/*here main thread and thread 0 bith are executing same time, for method taking more time to execution of total.
 * thats why problem occure in calculation printint 0.
 so avoid this problem we will provide main thread in waiting state. after complete for loop execution we will notify and release lock.*/


/*
class Counter extends thread
{
	int total = 0;
	@Override
	public void run() 
	{
		synchronized (this) 
		{
			for(int i=1; i<=10; i++)
			{
				total = total+100;
			}
			this.notify();
		}
	}
}

public class WaitMethod_NotifyMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		Counter c = new Counter();
		c.start();
		
		synchronized (c) 
		{
			c.wait();
			System.out.println("Total value is : "+ c.total+" :- "+c.currentThread().getName());

		}		
	}

}

*/