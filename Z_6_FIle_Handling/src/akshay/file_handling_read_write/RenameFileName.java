package akshay.file_handling_read_write;

import java.io.File;
import java.io.IOException;

public class RenameFileName 
{
	public static void main(String[] args) throws IOException 
	{
		File oldFile = new File("D:\\NARESH it NOTES\\file\\pavan.txt");
		File newFile = new File("D:\\NARESH it NOTES\\file\\vaishu.txt");
		if(oldFile.exists())
		{
			oldFile.renameTo(newFile);
			System.err.println("File Rename SuccessFully....!");
		}
		else
		{
			System.err.println("File Not Found....!");
		}
	}
}
