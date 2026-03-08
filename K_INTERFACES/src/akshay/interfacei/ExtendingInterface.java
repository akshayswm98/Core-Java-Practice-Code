package akshay.interfacei;

/*we can inherited interface */
interface A
{
	void m1();
}

interface B extends A
{
	void m2();
}

class Myclass implements B
{
	@Override
	public void m1() 
	{
		System.out.println("m1 method overriden.");
	}
	
	@Override
	public void m2() 
	{
		System.out.println("m2 method overriden..");
	}
}
public class ExtendingInterface 
{
	public static void main(String[] args) 
	{
		Myclass my = new Myclass();
		my.m1();
		my.m2();
	}

}
