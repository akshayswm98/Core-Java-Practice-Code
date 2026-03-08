package akshay.threadclass_method;
class demo1 extends thread
{
	@Override
	public void run() 
	{
		System.out.println("Child priority."+thread.currentThread().getPriority());//get priority
		
	}
}
public class GetPriority_SetPriority 
{
	public static void main(String[] args) 
	{
		System.out.println("main threads");//by default jvm provide 5
		System.out.println("main thrads old priority."+thread.currentThread().getPriority());
		thread.currentThread().setPriority(10);// set priority
		System.out.println("main threads new priority"+thread.currentThread().getPriority());
		demo1 d = new demo1();
		d.start();
		
	}

}
//both are final method.
/*As we know i cant imagine which task willl executed first. thats why using priority concept to set priority and get priority.*/
