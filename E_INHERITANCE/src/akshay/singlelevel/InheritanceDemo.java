package akshay.singlelevel;
class Parent
{
	public void house()
	{
		System.out.println("3 BHK House");
	}
}

class Child extends Parent
{
	
	public void car()
	
	{
		System.out.println("Audi Car");
	}
}

public class InheritanceDemo 
{

	public static void main(String[] args) 
	{
		Child ch = new Child();
		
		ch.car();
		ch.house();

	}

}
