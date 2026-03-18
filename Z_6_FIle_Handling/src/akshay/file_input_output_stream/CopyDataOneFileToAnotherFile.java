package akshay.file_input_output_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataOneFileToAnotherFile 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream r = new FileInputStream("D:\\NARESH it NOTES\\file\\patil.txt");
		FileOutputStream w = new FileOutputStream("D:\\NARESH it NOTES\\file\\vaishu.txt");
		
		int i;
		while((i = r.read()) != -1)
		{
			w.write((char)i);
		}
		r.close();
		w.close();
		System.err.println("Data Copied Successfully...!");
	}

}
