package akshay.dynamicpolymorphism;

class Vehicle
{
	public void run()
	{
		System.out.println("Generic vehicle is running");
	}
}

class Car extends Vehicle
{
	@Override
	public void run() {
		System.out.println("Car is running");
	}
}

class Audi extends Car
{
	@Override
	public void run() {
		System.out.println("Audi car is running");
	}
}
public class OverridingDemo2 {

	public static void main(String[] args) {
		Vehicle v1 = new Audi();
		v1.run();
	}

}
