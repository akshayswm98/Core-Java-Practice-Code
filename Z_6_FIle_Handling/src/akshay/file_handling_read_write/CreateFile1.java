package akshay.file_handling_read_write;
/*File handling defined how we can read and write data in a file
 * Java IO package contained all the classes through which we can perform,
   all input and ouput operation in the file.
 * Stream is sequence of data on basis of java.IO package all the classes
   divided into two stream.
   1.byte,,,2.character*/


import java.io.File;
import java.io.IOException;

public class CreateFile1 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{

			File file = new File("D:\\NARESH it NOTES\\file\\akshay.txt");
			if(file.createNewFile())
			{
				System.out.println("File SuccesFully Created...!");
			}
			else
			{
				System.out.println("File Already Exist....!");
			}
		
		}
		catch(IOException e)
		{
			System.out.println("Exception Handle....!");
			System.out.println("my first");
		}
	}	
	
}