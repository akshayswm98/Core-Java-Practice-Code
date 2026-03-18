package akshay.file_reader_writer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String path = "D:\\NARESH it NOTES\\file\\demo.txt";
		FileWriter fw = new FileWriter(path);
		try (fw)
		{
			System.out.println("Enter data to store in file:");
			String data = sc.nextLine();
			fw.write(data);
			System.out.println("Data successfully written into file.");
		}
		catch (IOException e)
		{
			System.out.println("Writing error: " + e);
		}

		// ----------- READ OPERATION ------------
		FileReader fr = new FileReader(path);
		try (fr)
		{
			System.out.println("\nReading data from file:");
			int ch;
			while ((ch = fr.read()) != -1)
			{
				System.out.print((char) ch);
			}
		}
		catch (IOException e)
		{
			System.out.println("Reading error: " + e);
		}
		finally
		{
			sc.close();
		}
	}
}
