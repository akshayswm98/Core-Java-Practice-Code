package akshay.interfacei;


interface A1
{
	default void m1()
	{
		System.out.println("Default method of interface.");
	}
}

class B1
{
	public void m1()
	{
		System.out.println("Concreate method of B class.");
	}
}

class C1 extends B1 implements A1
{
	
}
public class DefaultMethodConcreateMethodPriority 
{
	public static void main(String[] args) 
	{
		C1 c1 = new C1();
		c1.m1();
	}

}

/*Here while working with class and interface , default method having low
 priority than concrete method, In the same way class is more priority than
 interface.*/
