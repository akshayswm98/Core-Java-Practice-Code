package akshay.interfacei;
/*we can achieve 100% Abstraction.
 An interface contained only abstract method that means 
 there is a guarantee that only contained abstract method.
 
 interface method are by default public and abstract.
 
 we can achieved interface by using implements keywords.
 
 interface variable is by default public static and final.
 
  interface does not contained constructor so we can achieve multiple inheritance.
  
  the main purpose of the interface to achieve loose coupling and dynamic polymorphim. */

sealed interface Moveable1 permits Car
{
	int MAX_SPEED = 120;  //public + final + static
	
	void move();//public + abstract
}

non-sealed class Car implements Moveable1
{
	@Override
	public void move() 
	{
		System.out.println("Car is a movind with "+MAX_SPEED+ "km/hr");
	}
}
public class InterfaceDemo1 
{

	public static void main(String[] args) 
	{
		Moveable1 car = new Car();
		car.move();
	}

}
