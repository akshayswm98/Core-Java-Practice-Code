package akshay.runnable_interface;
class Demo implements Runnable 
{
	@Override
	public void run() 
	{
		System.out.println("First threads");
	}
}
public class Demo1 
{

	public static void main(String[] args) 
	{
		//Thread t = new Thread(new Demo());// we can do 
		//t.start();
		
		Demo d = new Demo();
		Thread t = new Thread(d);
		t.start();
		
	}

}
/*Start method is belonging from Thread class so we will create object of thread class
 * and passing object in constructor. */
 