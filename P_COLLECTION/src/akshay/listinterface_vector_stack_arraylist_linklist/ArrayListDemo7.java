package akshay.listinterface_vector_stack_arraylist_linklist;
//Serialization,De_serialization.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo7 
{
	public static void main(String[] args) throws IOException 
	{
		ArrayList<String> listOfIcecream = new ArrayList<String>();
		listOfIcecream.add("Vanilla");
		listOfIcecream.add("strwbarry");
		listOfIcecream.add("Butter Scotch");
		
		//Serialization
		String filePath = "D:\\NARESH it NOTES\\file\\icecream.txt";
		
		FileOutputStream fos = new FileOutputStream(filePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos;oos)
		{
			oos.writeObject(listOfIcecream);
			System.out.println("Data Store Success FUlly...!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		//DeSerialization
		
		FileInputStream fis = new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try(fis;ois)
		{
		//	@SuppressWarnings("unchecked")
			ArrayList<String> list = (ArrayList<String>) ois.readObject();
			System.out.println(list);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
