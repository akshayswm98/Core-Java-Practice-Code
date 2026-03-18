package akshay.file_reader_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		try (FileWriter fw = new FileWriter("D:\\NARESH it NOTES\\file\\demo.txt"))
		{
			System.out.println("Enter ONLY characters (no numbers):");
			String data = sc.nextLine();

			// validation: only letters and spaces
			if (data.matches("[a-zA-Z ]+"))
			{
				fw.write(data);
				System.out.println("Successfully stored data in file!");
			}
			else
			{
				System.out.println("Invalid input Numbers are not allowed.");
			}
		}
		catch (IOException e)
		{
			System.out.println("File error: " + e);
		}
		finally
		{
			sc.close();
		}
	}
}
