package akshay.ravi_sir_program;

import java.awt.font.TextAttribute;

class Test1 extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Child thread is running.");
		System.out.println("It is running witg seperate stack..!");
	}
}
public class IsALive_Method 
{
	public static void main(String[] args) 
	{
		System.out.println("main thread."+Thread.currentThread().getName());
		Test1 t = new Test1();
		System.out.println(t.isAlive());// method return boolean.if not available False.
		t.start();
		System.out.println(t.isAlive());//Available return true.
		
		t.start();//java.lang.illegalthread statement exception
	}

}
