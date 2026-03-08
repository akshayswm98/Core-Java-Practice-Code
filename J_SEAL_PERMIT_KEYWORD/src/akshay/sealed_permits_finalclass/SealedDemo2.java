package akshay.sealed_permits_finalclass;


sealed class OnlineClass permits Laptop,Mobile
{
	public void attendJavaOnline()
	{
		System.out.println("Sunday online classes");
	}
}

final class Laptop extends OnlineClass
{
	@Override
	public void attendJavaOnline() 
	{
		
		System.out.println("Attending java class through Laptop");
	}
}

final class Mobile extends OnlineClass
{
	@Override
	public void attendJavaOnline() 
	{
		System.out.println("Attending Class through Mobile");
	}
}
public class SealedDemo2 
{

	public static void main(String[] args) 
	{
		OnlineClass onlineclass = null;
		
		onlineclass = new Laptop();
		onlineclass.attendJavaOnline();
		
		onlineclass = new Mobile();
		onlineclass.attendJavaOnline();
	}

}
