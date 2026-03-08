package akshay.threadclass_method;

public class CurrentThread_GetName 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
	}

}
//currentThread():-trace the location where thread is created, it is the static method.
//getName():-print the name of class where thread is created.it is final method.