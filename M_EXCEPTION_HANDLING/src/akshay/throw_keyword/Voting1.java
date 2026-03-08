package akshay.throw_keyword;
/*Generally we are using throw keyword for custom exception and user defiend exception.
 * For creating object for exception*/
import java.util.Scanner;

class AgeMismatchException extends RuntimeException // user defined exception class.
{

	public AgeMismatchException(String msg) 
	{
		super(msg);// holding msg inside parent class.
	}
	
}

public class Voting1 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Age: ");
			int age = sc.nextInt();
			
			if(age < 18)
			{
				throw new AgeMismatchException("Sorry.You Are Not Eligible For Voting...!");
			}
			else
			{
				System.out.println("You Can Vote Succefully...!");
			}
		}
		catch(AgeMismatchException e)
		{
			System.err.println("Age Required For Voting Minimmum 18 Years, Thank You...!"+e);
		}
			System.out.println("Next Step.");
	}

}


/*
 
 IS A PREDEFINED EXCEPTION 
 
 public class Dividetion
 {
 	public static void main (String [] args);
 	{
 		int a = 12;
 		int b = 0;
 		int c = a/b; 
 		sysout(c);
 	}
 }	
 	/*here main method creating object,that object having Exception class name,
 	  Description name, stack trace name.
 	  JvM ascking main method are handle exception then main method say no...
 	  in that case jvm execute program abnormally and passing object to DEFAULT EXCEPTION HANDLER
 	  and default exception handler printing all exception details.*/
 	
 
