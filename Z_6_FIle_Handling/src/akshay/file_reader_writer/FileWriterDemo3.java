package akshay.file_reader_writer;

import java.io.FileWriter;
import java.io.IOException;

/*It is a predefined class Available in java.IO package.
 * It is used to create file and write data in character form.
 *  */
public class FileWriterDemo3 
{
	public static void main(String[] args) throws IOException  
	{
		FileWriter f = new FileWriter("D:\\NARESH it NOTES\\file\\filewtriter.txt");
		try(f)
		{
			String str =" My name is akshay patil ";
			f.write(str);
			System.out.println("Data Stored Successfully...!");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			f.close();
		}
	}

}
