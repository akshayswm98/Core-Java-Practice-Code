package akshay.serialization_dserialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo1
{
    public static void main(String[] args) throws IOException
    {
    	 FileInputStream fis = new FileInputStream("D:\\NARESH it NOTES\\file\\demo.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
        try (fis; ois)
         
        {
            System.out.println("Employee Details:\n");

            while (true)
            {
                Employee emp = (Employee) ois.readObject();
                System.out.println(emp);
            }
        }
        catch (EOFException e)
        {
            System.out.println("\n--- End of File ---");
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred: " + e);
        }
    }
}
