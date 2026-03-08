package akshay.thread_class;
class Video extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Playing Video."+Thread.currentThread().getName());
	}
}
class Adio extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Start Adio."+Thread.currentThread().getName());
	}
}

class Timer extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Show timer."+Thread.currentThread().getName());
	}
}


public class VlcPlayer {

	public static void main(String[] args) 
	{
		Video v = new Video();
		v.start();
		
		Adio a = new Adio();
		a.start();
		
		Timer t = new Timer();
		t.start();
		
	}

}
