package akshay.staticblock;
/*the main purpose of static block to initialize
  the static data member of the class */

class Sample
{
	static int x;
	static
	{
		x = 100;
		System.out.println("x value is "+x);
	}
}
public class InitializeStaticMember {

	public static void main(String[] args) 
	{
		System.out.println("main method");
		new Sample();
	}
	static
	{
		System.out.println("main method sb");
	}

}
