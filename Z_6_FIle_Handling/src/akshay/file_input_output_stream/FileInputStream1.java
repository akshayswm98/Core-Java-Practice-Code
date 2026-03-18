package akshay.file_input_output_stream;

import java.io.FileInputStream;
import java.io.IOException;

/*It Is a predefined class in java.IO package.
 * it comes under binary stream.
 * it is used to read data in binary format*/
public class FileInputStream1 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream f = new FileInputStream("D:\\NARESH it NOTES\\file\\demo.txt");
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

}
