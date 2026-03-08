package akshay.singlelevel.constructorchainy;

// even empty class javac will added  Default constructor 
// and super() in that class.

class Super
{
	public Super()
	{
		System.out.println("Super class constructor..!");
	}
}

class Sub extends Super
{
	//Empty Class
}

class SubOne extends Super
{
	public SubOne()
	{
		System.out.println("SubOne Class Constructor..!");
	}
}
public class ConstructorChaning2 
{

	public static void main(String[] args) 
	{
		new SubOne();
	}

}
