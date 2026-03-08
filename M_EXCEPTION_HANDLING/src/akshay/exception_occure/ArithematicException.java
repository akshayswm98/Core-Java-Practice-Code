package akshay.exception_occure;
/*Exception Is A runtime error which is occur during the execution of program, it will
 Disturb the flow of program.*/

public class ArithematicException 
{
/*	public static void main(String[] args) 
	{
		int a = 100;
		int y = 0;
		int z = a/0;// it will provide Arithmetic exception
		System.out.println(z);
	}
*/
	
	
	
	public static void main(String[] args) 
	{
		try// inside of try block we can write risky code.
		{
			int a = 100;
			int y = 0;
			int z = a/0;
			System.out.println(z);
		}
		catch(Exception e)//Exception is a super class for all exception class.
		{                 // e is a reference variable.
			System.out.println(e);
		}
	}
}
