package akshay.ravi_sir_program;

//create thread.

class MyThread extends Thread
{
	@Override
	public void run() //task code 
	{
		System.out.println("Hello User Are you ready to perform task.");
	}
}
public class Run_Start_Method 
{
	public static void main(String[] args) 
	{
		System.out.println("main thread start..!");
		MyThread y = new MyThread();
		y.start();//creating thread,,,internally call run method.
		System.out.println("main thread ends.!");
	}

}
