package akshay.threadclass_method;

class thread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("start thread " +thread.currentThread().getName());
	}
}
public class IsAliveMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("start thread " +thread.currentThread().getName());
		thread t = new thread();
		System.out.println(t.isAlive());//return boolean value.
		t.start();
		System.out.println(t.isAlive());
		
	}

}
