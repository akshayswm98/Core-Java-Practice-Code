package akshay.staticblock;

//here Foo class file not loaded so static block is not executed

class Foo
{
	public Foo()
	{
		System.out.println("no parameterise constructor");
	}
	
	static
	{
		System.out.println("Static block");
	}
}

public class ExecuteAfterLoadingClassOnly 
{

	public static void main(String[] args) 
	{
		System.out.println("main method");
	}
	
	
	
}
