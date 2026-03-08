package akshay.demon_threads;
class Demo extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Demon Threads");
	}
}
public class CreateDemonThreads 
{
	public static void main(String[] args) 
	{
		System.out.println("main threads");
		Demo d = new Demo();
		d.setDaemon(true);
		d.start();
	}

}


/*It is working in a backend of threads
 * it is used to provide service to the threads.
 * we will not ctreat demon threads before main threads.
 * setDemon,,and is demon is a two method of demon threads*/
