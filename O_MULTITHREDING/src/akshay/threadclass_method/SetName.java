package akshay.threadclass_method;

public class SetName 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Akshay");//set the name of thread
		System.out.println(Thread.currentThread().getName());
		
		
	}

}
