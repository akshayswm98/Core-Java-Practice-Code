package akshay.exception_occure;
/*Arrys size must be possitive integer only,
 * if we pass negative size then we will get an exception.*/
public class NegativeArrySizeException 
{
	/*
	public static void main(String[] args) 
	{
		int size = -12;
		int []arr = new int [size];
	}
	*/
	
	public static void main(String[] args) 
	{
		try
		{
			int size = -12;
			int []arr = new int [size];
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
