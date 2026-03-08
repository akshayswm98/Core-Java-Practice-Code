package akshay.multilevelInheritance;

/*whenever you print toString method in both class, and creating object base class 
 * then print only base class toString  method.
 * you want to print all class method in that case need upcasting. */

class A
{
	public String toString()
	{
		return "A class" ;
	}
}

class B extends A
{
	public String toString()
	{
		
		return "B class";
	}
}

class C extends B
{
	public String toString()
	{
		
		return "C class";
	}
}

public class OverridingDemo 
{

	public static void main(String[] args) 
	{
		A a = new A();
		System.out.println(a.toString());//normal object
		
		A b = new B();
		System.out.println(b.toString());//upcasting
		
		A c = new C();
		System.out.println(c.toString());//upcasting
	}

}
