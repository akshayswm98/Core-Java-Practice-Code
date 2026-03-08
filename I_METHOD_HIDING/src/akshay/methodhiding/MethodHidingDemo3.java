package akshay.methodhiding;
class Super1
{
	public static void m1()// static method
	{
		
	}
}
class Sub1 extends Super1
{
	public void m1() // We can not Override static method with non static
	{
		
	}
}
public class MethodHidingDemo3 
{

	public static void main(String[] args) 
	{
		Sub1 s = new Sub1();
		s.m1();

	}

}

/*We can not override static method with non static method
 Because static method is class property and non static method
 is a object propery.CE*/
 