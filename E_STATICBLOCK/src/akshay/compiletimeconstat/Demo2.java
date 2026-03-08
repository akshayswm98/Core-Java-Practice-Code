package akshay.compiletimeconstat;
class Demo
{
	public static final int A=m1();
	static
	{
		System.out.println("Static block");
	}
	public static int m1()
	{
		return 500;
	}
}
public class Demo2 
{

	public static void main(String[] args) 
	{
		System.out.println(Demo.A);
	}

}
/*here static block executed dont have compile time constant*/
