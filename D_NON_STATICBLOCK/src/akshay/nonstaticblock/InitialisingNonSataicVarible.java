package akshay.nonstaticblock;

class Initializing
{
	int x;
	
	{
		 x = 10;
		System.out.println("Instance block we will use to initialize non static variable.");
	}
	
	public void show()
	{
		System.out.println("Value x is :- "+x);
	}
}
public class InitialisingNonSataicVarible 
{

	public static void main(String[] args) 
	{
		Initializing in = new Initializing();
		in.show();
	}

}
