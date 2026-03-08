package akshay.enumclass;

public class EnumDemo3 
{
	enum Color
	{
		red,blue;
	}
	public static void main(String[] args) 
	{
		Color c1 = Color.red;
		Color c2 = Color.blue;
		
		if(c1 == c2)
		{
			System.out.println("== operator");
		}
		
		if(c1.equals(c2))
		{
			System.out.println("equals method");
		}
	}

}

/*enum constant we can compared by using == operator and aslo equal method*/
