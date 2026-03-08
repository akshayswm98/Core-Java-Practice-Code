package akshay.singlelevel.constructorchainy;

//javac will Automatically added super keyword in constructor
//first line any constructor reserve for supper keywords.

class Alpha
{
	public Alpha()
	{
		System.out.println("Alpha clas Constructor..!");
	}
}

class Beta extends Alpha
{
	public Beta()
	{
		System.out.println("Beta class constructor..!");
	}
}

public class ConstroctureChaining1 
{

	public static void main(String[] args) 
	{
		new Beta();
	}

}
