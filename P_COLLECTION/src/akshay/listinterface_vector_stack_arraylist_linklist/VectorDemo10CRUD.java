package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo10CRUD 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("......Using Vector Class Performing CRUD Operation........");
			System.out.println("1.Insert Element");
			System.out.println("2.Delete Element");
			System.out.println("3.Update Element");
			System.out.println("4.Search Element");
			System.out.println("5.Display Element");
			System.out.println("6.Exit");
			System.out.println("Select Your Choice..!");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1://insert Elements
				System.out.println("Enter The Element:- ");
				int add = Integer.parseInt(sc.nextLine());
				
				v.add(add);
				System.out.println(add+" Elements Insert Succesfully.");
				break;
			
			case 2://delete Elements
				if(v.isEmpty())
				{
					System.err.println("Vector Is Empty can't Delete Element.");
				}
				else
				{
					System.err.println("Enter Delete Element");
					int delete = Integer.parseInt(sc.nextLine());
					
					if(v.remove(Integer.valueOf(delete)))
					{
						System.out.println(delete+" Element delete Succesfully");
					}
					else
					{
						System.err.println("Elements Not Found");
					}
				}
				break;
				
			case 3://Update Elements
				if(v.isEmpty())
				{
					System.err.println("Vector Class Is Empty");
				}
				else
				{
					System.out.println("Enter Elements You Want to Update");
					int oldEle = Integer.parseInt(sc.nextLine());
					
					int index = v.indexOf(oldEle);
					
					if(index != -1)
					{
						System.out.println("Enter New Element:- ");
						int newEle = Integer.parseInt(sc.nextLine());
						v.set(index, newEle);
						System.out.println(newEle+" Elements Update Succesfully.");
					}
					else
					{
						System.out.println("Elements Not Found.");
					}
				}
				break;
				
			case 4://search elements
				if(v.isEmpty())
				{
					System.err.println("List Is Empty");
				}
				else
				{
					System.out.println("Enter elements You want to serch");
					int search = Integer.parseInt(sc.nextLine());
					
					if(v.contains(search))
					{
						System.out.println(search + " Elements Is Available In Vector Class");
					}
					else
					{
						System.err.println(search+" Elements Is Not Available In Vector Class");
					}
				}
				
				
				break;
				
				
			case 5://Display Element
				if(v.isEmpty())
				{
					System.err.println("List Is Empty");
				}
				else
				{
					System.out.println("List Of Element");
					v.forEach(list -> System.out.println(list));
				}
				break;
				
			case 6:
				System.out.println("program is exit");
				sc.close();
				System.exit(0);
				
			default:
					System.err.println("Invalid Choice...!");
			
			}
		}
	}

}
