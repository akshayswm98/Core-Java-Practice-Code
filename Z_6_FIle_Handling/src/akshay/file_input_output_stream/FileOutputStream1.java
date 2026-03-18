package akshay.file_input_output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*It is a predefined class in java available java.IO package.
 * we can write binary data in the file.
 * we can write text and character data.*/

/*
public class FileOutputStream1 
{
	public static void main(String[] args) {
		String str = "abcdef";
		byte[] data = str.getBytes();//we can string data to bite.
		System.out.println(Arrays.toString(data));
	}

}

*/

public class FileOutputStream1 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream f = new FileOutputStream("D:\\NARESH it NOTES\\file\\demo.txt");
		try(f)
		{
			String data = "Akshay";
			byte[] str = data.getBytes();
			f.write(str);
			System.out.println("data stored succesfully...!");
			System.out.println(Arrays.toString(str));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
}