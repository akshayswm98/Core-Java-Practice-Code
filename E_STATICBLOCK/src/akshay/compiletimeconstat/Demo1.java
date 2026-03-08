package akshay.compiletimeconstat;
/*A compile time constant is a constant that is
  evaluated and replaced with is value at
  compile time.
  It must be declared static and final modifier */

class Test
{
	public static final int A = 100;
	
	static
	{
		System.out.println("Static block");
	}
}
public class Demo1 
{

	public static void main(String[] args) 
	{
		System.out.println(Test.A);
		new Test();
	}

}
