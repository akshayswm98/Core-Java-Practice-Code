/*performing single task using single thread.*/
package akshay.thread_class;

class Task extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("task 1");
	}
}
public class Task1
{
		public static void main(String[] args) 
	{
		Task t = new Task();
		t.start();
	}

}
