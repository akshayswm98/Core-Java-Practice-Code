package akshay.methodhiding;

class Super2
{
	public static void m2()
	{
		System.out.println("Super class method");
	}
}

class Sub2 extends Super2
{
	
}
public class MethodHidingDemo4 {

	public static void main(String[] args) {
		Sub2.m2();

	}

}

/* A Static method of super class is by default available 
   in sub class so from sub class we can directly call 
   the static method of super class by using class name
   or using object reference.*/
