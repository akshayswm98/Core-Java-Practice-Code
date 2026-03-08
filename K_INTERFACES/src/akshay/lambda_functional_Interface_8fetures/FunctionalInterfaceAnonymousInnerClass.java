package akshay.lambda_functional_Interface_8fetures;


interface Animels// inside interface is only one abstract method
{
	void makeSound(); //thats why Functional interface.
	
}

public class FunctionalInterfaceAnonymousInnerClass 
{
	public static void main(String[] args) 
	{
		// Anonymous inner class.
		Animels dog = new Animels() 
		{
			
			@Override
			public void makeSound() 
			{
				System.out.println("Dog are barking..");
			}
		};
		
		
		//Anonymous inner class.
		Animels cat = new Animels() 
		{
			
			@Override
			public void makeSound() 
			{
				System.out.println("cat is doing mau mau..");
			}
		};
		
		dog.makeSound();
		cat.makeSound();
	}
	

}
