package akshay.threadclass_method;
class DoStuff extends thread
{
	@Override
	public void run() 
	{
		String name = thread.currentThread().getName();
		System.out.println("Running Thrads Name Is: "+name);
	}
}
public class GetNameMethodsSetNameMethodR 
{
	public static void main(String[] args) 
	{
		DoStuff d = new DoStuff();
		d.start();
		
		d.setName("Akshay");//set the name.
		
		DoStuff d1 = new DoStuff();
		d1.start();
		
		System.out.println(thread.currentThread().getName()+": thread is running...");
	}

}
/*it is use for get the name of thread. when we will create the user defined thread,then jvm give name 
 * thread_0,,,thread-1 etc. 
 * when user provide the name of thread then change the name.
 * we have the method of setName for changing the name of thread.*/
