package akshay.nonstaticblock;

//instance block execute before constructor.
class Constructor
{
	public Constructor()
	{
		System.out.println("no parameterise constructor.");
	}
	
	{
		System.out.println("Instance block execute before constructor.");
	}
}

public class BeforeConstructor 
{

	public static void main(String[] args) 
	{
		new Constructor();
	}

}
