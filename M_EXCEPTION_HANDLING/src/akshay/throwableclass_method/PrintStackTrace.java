package akshay.throwableclass_method;

import java.util.Scanner;

/*It is the public void non static method.
 * void printStackTrace() It will provide all information about exception
   exception name, description name, stack trace so on.*/
public class PrintStackTrace 
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
			e.printStackTrace();
		}
	}

}
