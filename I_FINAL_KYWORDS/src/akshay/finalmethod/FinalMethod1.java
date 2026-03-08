package akshay.finalmethod;
/*whenever we declare method as a final then 
 we can not override that method in the sub class.
 
 when we can declare method as a final then implementation
 of the method is very important.
 
 if we do not change the super class method body in sub class 
 then we should declare method as the final. */


class A
{
	protected int a = 10;
	protected int b = 20;
	
	public final void calculate()
	{
		int sum = a+b;
		System.out.println("Sum is "+sum);
	}
}

class B extends A
{
	public void calculate()  // CE,,,,cant override final method.
	{
		int mul = a*b;
		System.out.println("mul is "+mul);
	}
}
public class FinalMethod1 
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.calculate();
	}

}
