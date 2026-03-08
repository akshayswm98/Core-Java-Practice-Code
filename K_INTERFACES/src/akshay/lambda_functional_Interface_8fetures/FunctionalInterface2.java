package akshay.lambda_functional_Interface_8fetures;

interface Animels1
{
	void makeSound();
}


public class FunctionalInterface2 
{
	public static void main(String[] args) 
	{
		// Anonymous Inner Class
		Animels1 lion = new Animels1() 
		{
			
			@Override
			public void makeSound() 
			{
				System.out.println("Lion make sound");
			}
		};
		// anonymous inner class
		Animels dog = new Animels() 
		{
			
			@Override
			public void makeSound() 
			{
				System.out.println("Dog are Barking.");
			}
		};
		
		lion.makeSound();
		dog.makeSound();
	}

}
