
package akshay.creatthreads;

class Demo extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Start the thread");
	}
}
public class CreateThreads 
{
	public static void main(String[] args)
	{
	System.out.println("main method started");
	Demo d = new Demo();
	
	d.start();
	System.out.println("main method ended");
	}
}



/* Multitasking:- Performing Multiple task in Single time.1)process base, 2)thread base.
 
 * 1)process base:- When one System connected to multiple CPU, And execute single single process in same time.
   
 * 2)Thread Base:-thread is smallest sub task in the process, suppose VLC player is a task.
   but inside we can able to see video, audio,time process i think is the smallest sub task.
   
 * Generally we can use multi threading for achieving multitasking.
  
 *we can achieving multithreding using predefined class and interface.
 *1)public Class Thread.having lots of method. run(), start(),getName(),isLive().
 *2)public Interface Runnable. having only one Abstract run ();    */
