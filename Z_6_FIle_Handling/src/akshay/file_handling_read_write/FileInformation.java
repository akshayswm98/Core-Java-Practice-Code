package akshay.file_handling_read_write;

import java.io.File;

public class FileInformation 
{
	public static void main(String[] args) 
	{
		File file = new File("D:\\NARESH it NOTES\\file\\demo.txt");
		if(file.exists())
		{
			System.out.println("File Name: "+file.getName());
			System.out.println("File Location: "+file.getAbsolutePath());
			System.out.println("File Readable: "+file.canRead());
			System.out.println("File Writable: "+file.canWrite());
			System.out.println("File Size: "+file.length());
		}
		else
		{
			System.out.println("File Does Not Exist...!");
		}
	}

}
