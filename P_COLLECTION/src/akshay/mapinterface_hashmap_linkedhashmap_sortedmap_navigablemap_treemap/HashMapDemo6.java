package akshay.mapinterface_hashmap_linkedhashmap_sortedmap_navigablemap_treemap;

import java.util.HashMap;

public class HashMapDemo6 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> studentRecord = new HashMap<>();
		studentRecord.put(101, "Roza");
		studentRecord.put(102, "Jasmin");
		studentRecord.put(103, "Juhi");
		studentRecord.put(104, "Jemmy");
		
		System.out.println(studentRecord);
		
		int searchId = 103;
		String studentName = studentRecord.get(searchId);
		
		if(studentName != null)
		{
			System.out.println("Student with Id "+searchId+" is "+studentName);
		}
		else
		{
			System.out.println("Student with Id "+searchId+ " Not Found.");
		}
		
		studentRecord.put(103, "Laira");
		System.out.println("Update Record "+studentRecord);
		
		studentRecord.remove(104);
		System.out.println("Record After Removel "+studentRecord);
		
		int studentId = 101;
		System.out.println(studentId+" Id is available "+studentRecord.containsKey(studentId));
	}
}
