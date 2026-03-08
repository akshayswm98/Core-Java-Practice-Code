package akshay.upcastingdauncasting;

class Vehicle
{
	public void run()
	{
		System.out.println("Generic Vehicle is running ");
	}
}

class Car extends Vehicle
{
	@Override
	public void run() {
		System.out.println("Car is running na my boss");
	}
}

class Audi extends Car
{
	@Override
	public void run() {
		System.out.println("Audi car is running na my boss");
	}
}
public class UpcastingDemo2 {

	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		a.run();
				
		a = new Car();   //Upcasting
		a.run();  
		 
		a = new Audi();  //Upcasting
		a.run();

	}

}
