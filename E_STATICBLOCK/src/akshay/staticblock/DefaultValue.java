package akshay.staticblock;

/*Static having also default value*/

class Alpha
{
	static int x;
	
	static 
	{
		
		System.out.println("vlaue of x = "+x);
	}
}

public class DefaultValue 
{

	public static void main(String[] args) 
	{
		new Alpha();
	}

}
