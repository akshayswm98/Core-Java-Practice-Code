package akshay.lambda_functional_Interface_8fetures;

/*
 Functional interface simple implements class
 Without Anonymous inner class.
 
 interface Vehicle
{
	void run(); // functional interface
}

class Car implements Vehicle
{
	@Override
	public void run() 
	{
	 System.out.println("Car Is running..");	
	}
}

class Bike implements Vehicle
{
	@Override
	public void run() 
	{
		System.out.println("Bike is running.");
	}
}

class Bus implements Vehicle
{
	@Override
	public void run() 
	{
		 System.out.println("Bus is running.");
	}
}
public class LambdaDemo2 
{
	public static void main(String[] args) 
	{
		Vehicle v = null;
		
		v = new Car();
		v.run();
		
		v = new Bike();
		v.run();
		
		v = new Bus();
		v.run();
	}
}
*/

/*
 
 Using Functional interface And Anonymous inner class.
  
interface Vehicle 
{
	void run();
}

public class LambdaDemo2 
{
	public static void main(String[] args) 
	{
	
	//Anonymous Inner class.
		Vehicle car = new Vehicle() 
		{
			@Override
			public void run() 
			{
				System.out.println("Car is running");
			}
		};
		
		//Anonymous inner class.
		Vehicle bike = new Vehicle() 
		{
			@Override
			public void run() 
			{
				System.out.println("Bike is running");
			}
		};
		
		
		// Anonymous inner class.
		Vehicle bus = new Vehicle() 
		{
			@Override
			public void run() 
			{
				System.out.println("Bus is running");
			}
		};
		
		car.run();
		bike.run();
		bus.run();
	}
}
*/

interface Vehicle
{
	void run();
}
public class LambdaDemo2 
{
	public static void main(String[] args) 
	{
		Vehicle car = ()-> System.out.println("car is running");
		Vehicle bike = ()-> System.out.println("Bike is running");
		Vehicle bus = ()-> System.out.println("Bus is running");
		car.run(); bike.run(); bus.run();
	}
}


/*It is the main purpose of Anonymous Inner class.
 * to avoid Biolerplate code 
 * lambda expression work only with functional interface.*/
 