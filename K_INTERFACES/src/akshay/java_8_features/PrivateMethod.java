package akshay.java_8_features;

interface Demo
{
	default void display()
	{
		System.out.println("Default method");
		message();
	}
	
	private void message()
	{
		System.out.println("Interface private method.");
	}
}
public class PrivateMethod 
{
	public static void main(String[] args) 
	{
		Demo d = new Demo() 
		{
		};
		d.display();
	}

}
