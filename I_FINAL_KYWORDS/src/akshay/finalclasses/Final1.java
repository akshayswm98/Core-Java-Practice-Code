package akshay.finalclasses;
/*We are using final keyword in java are 3 time.
 * 1.To declare class as final(inheritance is not possible).
 * 2.To declare method as a final(Overriding is not possible).
 * 3. To declare a field,variable as a final(Re-Asignment is not possible).
  */

final class A   // final class 
{
	private int x = 100;
	public void setData()
	{
		x= 200;
		System.out.println(x);
	}
}

class B extends A  // final class we can not inherited not possible.
{
	
}
public class Final1 
{
	public static void main(String[] args) 
	{
		B b = new B();
		b.setData();  // here compilation error.
	}

}
