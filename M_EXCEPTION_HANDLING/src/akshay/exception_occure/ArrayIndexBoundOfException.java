package akshay.exception_occure;

public class ArrayIndexBoundOfException 
{
/*	public static void main(String[] args) 
	{
		int []arr = {10,20,30,40};
		System.out.println(arr[4]);//ArrysIndexOutOfBoundException

	}
*/
	
	public static void main(String[] args) 
	{
		try
		{
			int []arr = {10,20,30,40};
			System.out.println(arr[4]);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("last Statement");
		}
	}
}
