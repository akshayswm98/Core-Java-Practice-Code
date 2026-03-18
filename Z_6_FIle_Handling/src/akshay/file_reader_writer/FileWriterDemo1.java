package akshay.file_reader_writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter f = new FileWriter("D:\\NARESH it NOTES\\file\\demo.txt");
			try
			{
				f.write("Java Programing is the best language");
				
			}
			finally
			{
				f.close();
			}
			System.out.println("Successfully Write data in file.");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
