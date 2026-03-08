package akshay.java_8_features;

interface Alpha2
{
	default void m1()
	{
		System.out.println("Default method of alpha class");
	}
}

interface Beta2
{
	default void m1()
	{
		System.out.println("Default method Of beta class");
	}
}

class Implementer implements Alpha2,Beta2
{

	@Override
	public void m1() 
	{
		Alpha2.super.m1();
		Beta2 .super.m1();
		System.out.println("Multiple inheritance is possible using default method");
	}
	
}
public class UsingDefaulMethodInheritancePossible 
{

	public static void main(String[] args) 
	{
		Implementer i = new Implementer();
		i.m1();
	}

}

/*we can achieve multiple inheritance using default method Also, because 
 Interface never contain interface.
 */
