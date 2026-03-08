package akshay.creatthreads;

public class MainThread 
{	
	public static void main(String[] args) 
	{
		//without method chaining
		Thread th = Thread.currentThread();//check current thread
		
		System.out.println("Current thread name is: "+th.getName());//get name of the thread.
		
		//with method chaining
		String name = th.currentThread().getName();
		System.out.println("name of thread: "+name);
	}

}
//main thread find.