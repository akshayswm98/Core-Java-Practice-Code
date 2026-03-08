package akshay.methodhiding;

class Vehicle
{
	public static String name = "Generic Vehicle";
	
	public static void run()
	{
		System.out.println("generic vehicle is running");
	}
}

class Bike extends Vehicle
{
	public static String name = "Bike";
	
	public static void run()
	{
		System.out.println("Bike vehicle is running");
	}
}

class Car extends Vehicle
{
	public static String name = "Car";
	
	public static void run()
	{
		System.out.println("Car vehicle also running");
	}
	
}
public class MethodHidingDemo2 
{
	public static void main(String[] args) 
	{
		Vehicle v = new Car();
		v.run();
		System.out.println(v.name);
	}

}
