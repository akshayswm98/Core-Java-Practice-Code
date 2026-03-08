package akshay.throwableclass_method;
/*public String getMessage() it is also from throwable class non static method
 * it will provide only Description. */
import java.util.Scanner;

public class GetNameMethod 
{
	public static void main(String[] args) 
	{

		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number ");
		int n = sc.nextInt();
		
		System.out.println("Enter the second number ");
		int n1 = sc.nextInt();
		
		int result = n/n1;
		
		System.out.println("Dividetion is "+result);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
