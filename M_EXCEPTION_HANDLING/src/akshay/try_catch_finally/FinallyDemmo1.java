package akshay.try_catch_finally;

public class FinallyDemmo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started.");
		try
		{
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("guarenty for execution.");
			System.out.println("FInally block");
		}
		System.out.println("main method ended.");
	}

}

/*
 * we should newer write any closing statement inside try block. 
 Finally block mainly used for resource handling. Our resources file,
 database,and networks resources, we need to close these resources properly.
 
  finally block is always executed whether program contend exception othrewise not contend. 
  
  public class FinallyDemmo1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started.");
		try
		{
			System.out.println(10/0);
			system.exit(0);// in that case finally block not executes.
		}
		finally
		{
			System.out.println("guarenty for execution.");
			System.out.println("FInally block");
		}
		System.out.println("main method ended.");
	}

}
  
 */
