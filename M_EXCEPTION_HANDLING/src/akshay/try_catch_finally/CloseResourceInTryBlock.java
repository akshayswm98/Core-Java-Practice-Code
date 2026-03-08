package akshay.try_catch_finally;

import java.io.Closeable;
import java.io.IOException;

class DatabaseResources implements AutoCloseable
{
	public void close() throws Exception
	{
		System.out.println("Database Resources is Closed");
	}
}

class FileResources implements Closeable
{
	public void close() throws IOException
	{
		System.out.println("File Resources closed.");
	}
}
public class CloseResourceInTryBlock 
{
	public static void main(String[] args) 
	{
		DatabaseResources dr = new DatabaseResources();
		FileResources fr = new FileResources();
		
		try {
			try(dr ; fr)
			{
				System.out.println("try block.");
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divided by zero problem.");
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
