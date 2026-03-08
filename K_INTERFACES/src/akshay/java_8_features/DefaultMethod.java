package akshay.java_8_features;
/*whenever we declare interface and adding abstract method.
 * those method use compulsory inside implemented class. so developer 
 * find complexity thats why java introduce 8 feature.
 * adding default method
 * static method
 * private method and we also implement that method inside the interface.*/

interface Vehicle
{
	void run();
	void horn();
	
	//default method
	default void digitalMater() // java 8 feature
	{
		System.out.println("Digital mater comming soon..");
	}
}

class Car implements Vehicle
{
	@Override
	public void run() 
	{
		System.out.println("Car is runing..");
	}
	
	@Override
	public void horn() 
	{
		System.out.println("Car has Horn.");
	}
	
	@Override
	public void digitalMater() // java 8 feature 
	{
		System.out.println("Car is having digital matter.");	}
}

class Bike implements Vehicle
{
	@Override
	public void run() 
	{
		System.out.println("Bike is running.");
	}
	
	@Override
	public void horn() 
	{
		System.out.println("Bike has also horn.");
	}
}
public class DefaultMethod 
{
	public static void main(String[] args) 
	{
		Vehicle v = null;
		v = new Car();
		v.run();
		v.horn();
		v.digitalMater();
		
		v = new Bike();
		v.run();
		v.horn();
		v.digitalMater();
	}

}
