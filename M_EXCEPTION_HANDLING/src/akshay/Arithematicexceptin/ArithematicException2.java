//The main purpose of the Exception handling to provide user friendly msg.
//so client can enjoy the services of software website.

package akshay.Arithematicexceptin;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArithematicException2 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello Client, Wecome to my Application.");
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("pls enter first no:-");
			int a = sc.nextInt();
			
			System.out.println("pls enter second no:-");
			int b = sc.nextInt();
			
			int result = a/b;
			System.out.println("Result is :- "+result);
		}
		catch(Exception e)
		{
			System.err.println("pls dont put zero here..");
		}
		sc.close();
		System.out.println("thank you for visiting..");
	}

}
/*whenever our statement is error suspecting statement or risky statement
  then we should write that statement inside the try block.
 *the main purpose of the catch block to handle the exception is throws by try block.
 */
