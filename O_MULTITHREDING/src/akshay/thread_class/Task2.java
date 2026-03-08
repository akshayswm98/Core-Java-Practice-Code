/*Performing Single Task using multiple threads*/
package akshay.thread_class;

class ThreadClass extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("task 2");
	}
}
public class Task2 
{
	public static void main(String[] args) 
	{
		ThreadClass t1 = new ThreadClass();
		t1.start();
		
		ThreadClass t2 = new ThreadClass();
		t2.start();
		
		ThreadClass t3 = new ThreadClass();
		t3.start();
		
	}

}
