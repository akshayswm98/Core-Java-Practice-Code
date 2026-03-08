package akshay.staticblock;

class Beta
{
	final static int x;
	
	static
	{
		x = 100;
		System.out.println("Static Final field "+x);
	}
}

public class StaticBlankFinalField 
{

	public static void main(String[] args)
	{
		new Beta();
	}

}
