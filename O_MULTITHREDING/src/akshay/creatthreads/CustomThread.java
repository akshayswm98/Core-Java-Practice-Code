package akshay.creatthreads;

class Mythred extends Thread
{
	
	@Override
	public void run() 
	{
		System.out.println("You are ready to perform task.");
	}
}
public class CustomThread 
{
	public static void main(String[] args) 
	{
		System.out.println("Main threads starts");
		Mythred m = new Mythred();
		m.start();
		System.out.println("main threds end");
	}

}
/*start():- is a non static method, use for do request to OS assign new thread.
 * it will implicitly call run() method.*/
