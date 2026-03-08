package akshay.anonymousinnerclass;

abstract class Vehicle
{
	public abstract void run();
}


public class AnonymousDemo2 {

	public static void main(String[] args) 
	{
		Vehicle car = new Vehicle() 
		{
			
			@Override
			public void run() 
			{
				System.out.println("Car is running");
			}
		};
		
		Vehicle bike = new Vehicle() 
		{
			
			@Override
			public void run() 
			{
				System.out.println("Bike is running .");
			}
		};
		car.run();
		bike.run();

	}

}
