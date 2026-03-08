package akshay.Arithematicexceptin;

public class PrintStakeTrace 
{
	//All are throwable class method.
	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		
		try
		{
			String str = null;
			System.out.println(str.toUpperCase());//Convert to Upper case Format.
		}
		catch(Exception e)
		{
			System.out.println(e.toString());//Convert Object integer to String format.
			System.out.println("...............");
			
			System.out.println(e.getMessage());//is the throwable class method use for only print the error msg.
			System.out.println("................");
			
			e.printStackTrace();// it is use to print the complete details of Exception as like
								//error message,Error line no,and so on details.
		}
		System.out.println("Main Method Ended..");
	}
		
	

}
