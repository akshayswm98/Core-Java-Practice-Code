package akshay.dynamicpolymorphism;

class Animels1 {
	public void eat() {
		System.out.println("Generic animel Is eating");
	}
}

class Lion extends Animels1 {
	@Override
	public void eat() {
		System.out.println("Lion Animel is eating");
	}
}

class Dog1 extends Animels1 {
	@Override
	public void eat() {
		System.out.println("Dog Animels Is eating");
	}
}

public class UpcastingDemo1 
{
	public static void main(String[] args) 
	{
		Animels1 am = new Animels1();
		am.eat();
		am = new Lion();  //Upcasting
		am.eat();
		
		am = new Dog1();  //Upcasting
		am.eat();
	}

}
