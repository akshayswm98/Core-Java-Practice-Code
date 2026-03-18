package akshay.file_input_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileOutputStream2 
{

	public static void main(String[] args) throws IOException 
	{
		try
		{
		Scanner sc = new Scanner(System.in);
		FileOutputStream f = new FileOutputStream("D:\\NARESH it NOTES\\file\\demo.txt");
		System.out.println("Enter data into character format:");
		String str = sc.nextLine();
		byte[] data = str.getBytes();
		f.write(data);
		System.out.println("Data Stored Successfully...!");
		System.out.println("Print Added data: "+Arrays.toString(data));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
