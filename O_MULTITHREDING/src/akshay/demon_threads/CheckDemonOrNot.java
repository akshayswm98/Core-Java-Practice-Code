package akshay.demon_threads;
class Test1 extends Thread
{
	@Override
	public void run() 
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Demon Threads");
		}
		else
		{
			System.out.println("Chiled threads");
		}
	}
}
public class CheckDemonOrNot 
{
	public static void main(String[] args) 
	{
		System.out.println("main threads");
		Test1 t = new Test1();
		t.setDaemon(true);
		t.start();
	}

}
