package akshay.file_reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderDemo2 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader f = new FileReader("D:\\NARESH it NOTES\\file\\filewtriter.txt");
		try(f)
		{
			int i = 0;
			while(true)
			{
				i = f.read();
				if(i == -1)
				{
					break;
				}
				System.out.println((char)i);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
