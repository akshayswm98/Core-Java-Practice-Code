package akshay.methodhiding;

/*static method are not overriding only non static method 
 are overridden.
 Actually it is the method hiding concept.
 Here Sub class method hide super class method same signature
 We can not use @Overidden Annotation otherwise it will give CE.*/
class Super
{
	public static void m1()
	{
		System.out.println("Super class method");
	}
}

class Sub extends Super
{
	
	public static void m1()
	{
	
		System.out.println("Sub class method");
	}
}
public class MethodHidingDemo1 
{

	public static void main(String[] args) 
	{
		Sub s = new Sub();
		s.m1();
	}

}
