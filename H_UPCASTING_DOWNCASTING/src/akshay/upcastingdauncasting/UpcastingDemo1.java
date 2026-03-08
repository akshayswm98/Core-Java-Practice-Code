package akshay.upcastingdauncasting;
/*If we assign Sub class object Super class reference then
  it is called as upcasting */

class Animels {
	public void eat() {
		System.out.println("Generic animel Is eating");
	}
}

class Lion extends Animels {
	@Override
	public void eat() {
		System.out.println("Lion Animel is eating");
	}
}

class Dog extends Animels {
	@Override
	public void eat() {
		System.out.println("Dog Animels Is eating");
	}
}

public class UpcastingDemo1 
{
	public static void main(String[] args) 
	{
		Animels am = new Animels();
		am = new Lion();  //Upcasting
		am.eat();
		
		am = new Dog();  //Upcasting
		am.eat();
	}

}
