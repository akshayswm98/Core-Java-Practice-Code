package akshay.serialization_dserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo1
{
    public static void main(String[] args) throws IOException
    {
    	FileOutputStream fos = new FileOutputStream("D:\\NARESH it NOTES\\file\\demo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Scanner sc = new Scanner(System.in);

        try (fos; oos; sc)
        	{
            System.out.print("Enter number of employees: ");
            int noOfObj = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= noOfObj; i++)
            {
                System.out.println("\nEmployee " + i);
                Employee emp = Employee.getEmployeeObject();
                oos.writeObject(emp);
            }

            System.err.println("\nEmployee data stored successfully!");
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred: " + e);
        }
    }
}
