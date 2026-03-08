package akshay.has_a_relation.composition;
/*We can Achieve Has-A Relation using Composition with strong Reference
 Composition is a way to design classes such as one class contains an object
 of another class. */

class Engine
{
	private String engineType;
	private int enginePower;
	
	public Engine(String engineType, int enginePower) 
	{
		super();
		this.engineType = engineType;
		this.enginePower = enginePower;
	}

	@Override
	public String toString()
	{
		return "Engine [engineType=" + engineType + ", enginePower=" + enginePower + "]";
	}
	
	
}

class Car
{
	private String carName;
	private int carModel;
	private Engine engine; // Has-A-Relation
	
	public Car(String carName, int carModel) 
	{
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.engine = new Engine("petroll", 1500);//Composition
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carModel=" + carModel + ", engine=" + engine + "]";
	}
	
	
}
public class Composition 
{

	public static void main(String[] args) 
	{
		Car car = new Car("Swift", 2025);
		System.out.println(car);
	}

}
