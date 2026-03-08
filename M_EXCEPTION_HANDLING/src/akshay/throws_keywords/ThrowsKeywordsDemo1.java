package akshay.throws_keywords;
/*It is used only with the method, and compile time exception(check exception)
 * its throwing exception.*/

class Test
{
	static
	{
		System.out.println("Static block");
	}
}
public class ThrowsKeywordsDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		m1();
		System.out.println("main method ended");
	}
	
	public static void m1()
	{
		System.out.println("m1 method started");
		try
		{
			m2();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Handle By m1 method");
		}
		System.out.println("m1 method ended");
	}
	public static void m2()throws ClassNotFoundException
	{
		Class.forName("Test");
	}

}
