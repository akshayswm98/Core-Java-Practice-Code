/*performing multiple task from multiple thread*/
package akshay.thread_class;
class ThreadClass1 extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("task 1");
	}
	
}

class ThreadClass2 extends Thread
{
	@Override
	public void run() 
	{
	System.out.println("task 2");
	}
}

class ThreadClass3 extends Thread
{
	@Override
	public void run() 
	{
	System.out.println("task 3");
	}
}
public class Task3 
{
	public static void main(String[] args) 
	{
		ThreadClass1 t1 = new ThreadClass1();
		t1.start();
		
		ThreadClass2 t2 = new ThreadClass2();
		t2.start();
		
		ThreadClass3 t3 = new ThreadClass3();
		t3.start();
	}

}
