package akshay.try_catch_finally;

public class FinallyDemo2 
{
	public static void main(String[] args) 
	{
		try
		{
			int []x = new int [-2];
			x[0] = 12;
			x[1] = 15;
			System.out.println(x[0]+" : "+x[1]);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Array Size is in Negative Value.");
		}
		finally
		{
			System.out.println("Resources will be handle her.");
		}
		System.out.println("main method ended here.");
	}

}
