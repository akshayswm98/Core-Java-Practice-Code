package akshay.abstractclass;
/*whenever we declare method as a abstract then class should be as a abstract.
 
 when action is a common and implementation as different then we can declare abstract method.
 it will provide easiness to the programmer for remembering method name.
 abstract method at the last is terminator ;.
 Abstract method declare only in super class and implementation provide in sub class.
 abstract method does not contain any method body.
 it will showing only content.
 we can not use private ,final, and static keyword.
 */

abstract class Shape
{
	public abstract void draw();//Abstract method
}

class Square extends Shape
{

	@Override
	public void draw() 
	{
		System.out.println("Drawing squere"); //override method
		
	}
	
}

class Circle extends Shape
{

	@Override
	public void draw() 
	{
		System.out.println("Drawing Circle");
	}
	
}
public class AbstractDemo1 
{

	public static void main(String[] args) 
	{
		Shape shape = null;
		shape = new Square();
		shape.draw();
		shape = new Circle();
		shape.draw();
	}

}
