package akshay.demon_threads;

class Test extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Chiled Threads.");
	}
}
public class IsDemon_SetDemon 
{
	public static void main(String[] args) 
	{
		System.out.println("main threads.");
		Test t = new Test();
		t.setDaemon(true);//it is used to create demon threads.
		t.start();
		System.out.println(t.isDaemon());// if demon threads is created return true.
	}

}
