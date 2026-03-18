package akshay.file_reader_writer;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader r = new FileReader("D:\\NARESH it NOTES\\file\\demo.txt");
			try
			{
				int i;
				while((i=r.read())!=-1)
				{
					System.out.println((char)i);
				}
			}
			finally
			{
				r.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception Handle..!");
		}
	}

}
