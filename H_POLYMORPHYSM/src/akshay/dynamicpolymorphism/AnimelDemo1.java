package akshay.dynamicpolymorphism;

/*Method Overriding possible with non static method.
If we write more than two non static method in super and 
sub class with the same name and same signature is called 
as method overriding. and we can say "Run time polymorphism".*/

class Animels
{
	public void sleep()
	{
		System.out.println("Generic Animel Is Sleeping");
	}
}

class Dog extends Animels
{
	@Override
	public void sleep() 
	{
		super.sleep();
		System.out.println("Dog Animel Is sleeping");
	}
}

class Rabbit extends Dog
{
	@Override
	public void sleep() 
	{
		super.sleep();
		System.out.println("Rabit Animel is sleeping");
	}
}
public class AnimelDemo1 
{

	public static void main(String[] args) 
	{
		Rabbit rb = new Rabbit();
		rb.sleep();
	}

}