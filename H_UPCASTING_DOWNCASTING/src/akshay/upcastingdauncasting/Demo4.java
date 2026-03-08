package akshay.upcastingdauncasting;

class Animels1
{
	public void sleep()
	{
		System.out.println("Generic Animels..");
	}
}

class Dog2 extends Animels1
{
	
	@Override
	public void sleep() 
	{
		System.out.println("Dog Animels..");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		Animels1 d = new Animels1();
		d.sleep();
		d = new Dog2();
		d.sleep();

	}

}
