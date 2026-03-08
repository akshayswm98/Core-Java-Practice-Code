package akshay.Arithematicexceptin;

import java.util.Scanner;

public class ArithematicExceptin1 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started.");
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The First Number:-");
			int n1 = sc.nextInt();
			
			System.out.println("Enter The Second Number:-");
			int n2 = sc.nextInt();
			
			int result = n1/n2;
			
			System.out.println("Result Is:-"+result);
			System.out.println("End Of Try Block.");
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch Block.");
			System.err.println("Do not inter zero.");
		}
		System.out.println("Main Method Ended..");
		
	}

}

/*If we provided zero (0) then program will generated 
  java.lang.ArithemeticException and it will return in the middle.
  it is called Abnormal terminal.
  TryBlock we should always write risky code and inside of the 
  Catch block we will write handling code.*/
