package akshay.sealed_permits_finalclass;
/*It is a new feature introduced from JDK 17v.
  It is an improvement as a final keyword.
  using sealed keyword we can declare class and interface as sealed.
  1.Sealed class :- must be extends with permits class.
  2.non sealed :- can be extended any sub class.
  3.permits :- we can provide permission to sub classes which are inheriting 
  through sub class.
  4.final :- we can declare permitted sub class as final,so can not be extended further.  */

sealed class Bird permits Parrot,Peacock
{
	public void fly()
	{
		System.out.println("Generic bird is flying");
	}

}
non-sealed class Parrot extends Bird
{
	public void fly() 
	{
		System.out.println("Parrot bird is flying");
	}
}

final class Peacock extends Bird
{
	public void fly() 
	{
		System.out.println("peacock bird is flying");
	}
}
public class SealedDemo1 
{

	public static void main(String[] args) 
	{
		Bird b = new Parrot();
		
		b.fly();
		
		b = new Peacock();
		b.fly();
	}

}
