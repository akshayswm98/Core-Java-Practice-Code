package akshay.abstractclass;

/*In that Abstract class having a multiple non abstract method(implemented method)
  so, final conclusion is that we can achieve 0 to 100 percent Abstraction.*/
abstract class Bike
{
	protected int speed = 60;  //Instance variable
	
	public Bike()  //Constructor
	{
		System.out.println("No Argument Constructor");
	}
	
	public void getBikeDetails()//concreate method
	{
		System.out.println("My pulsor Bike");
	}
	public abstract void run();  // abstarct method
}

class Honda extends Bike
{
	@Override
	public void run() 
	{
		System.out.println("Honda Bike is runing");
	}
	
}
public class AbstractDemo2 {

	public static void main(String[] args) 
	{
		Bike bike = new Honda();
		System.out.println("Pulsor Bike Speed Is "+bike.speed);
		bike.getBikeDetails();
		bike.run();
	}

}

/*abstract class constructor will be executed with the help of supper keyword.*/
