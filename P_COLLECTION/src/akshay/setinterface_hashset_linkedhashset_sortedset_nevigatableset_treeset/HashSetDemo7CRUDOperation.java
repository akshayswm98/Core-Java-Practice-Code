package akshay.setinterface_hashset_linkedhashset_sortedset_nevigatableset_treeset;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo7CRUDOperation 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Option");
			System.out.println("1.Add Elements");
			System.out.println("2.Delete Elements");
			System.out.println("3.Display Elements");
			System.out.println("4.Serach Elements");
			System.out.println("5.Update Elements");
			System.out.println("6.Exit");
			
			System.out.println("Enter Your Choice(1/2/3/4/5/6)");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the elements to add:- ");
				String addElement = sc.nextLine();
				if(!addElement.matches("[a-zA-Z]+"))
				{
					System.err.println("Invalid Input! Only alphabets are allowed.");
					break;
				}
				if(hs.add(addElement))
				{
					System.out.println(addElement + " Element Added Succesfully.");
				}
				else
				{
					System.err.println(addElement + " Elements Already Exists.");
				}
				break;
				
			case 2:
				if(hs.isEmpty())
				{
					System.err.println("HashSet Is Empty..!");
				}
				else
				{
					System.out.println("Enter the element to delete");
					String deleteElement = sc.nextLine();
					if(hs.remove(deleteElement))
					{
						System.out.println(deleteElement + " Element Delete Succesfully");
					}
					else
					{
						System.err.println(deleteElement + " Elements Not Found");
					}
				}
				break;
				
			case 3:
				if(hs.isEmpty())
				{
					System.err.println("HashSet Is Empty");
				}
				else
				{
					System.out.println("HashSet Total Elements");
					hs.forEach(System.out::println);
				}
				break;
				
			case 4:
				System.out.println("Enter Elements To search");
				String searchElement = sc.nextLine();
				if(hs.contains(searchElement))
				{
					System.out.println(searchElement + " Have in List");
				}
				else
				{
					System.err.println(searchElement + " Not Available in list");
				}
				break;
				
			case 5:
			    if (hs.isEmpty()) 
			    {
			        System.err.println("Set is Empty");
			    } 
			    else 
			    {
			        System.out.println("Enter element to update:");
			        String oldElement = sc.nextLine();

			        if (hs.contains(oldElement)) 
			        {
			            System.out.println("Enter new element:");
			            String newElement = sc.nextLine();

			            hs.remove(oldElement);
			            hs.add(newElement);

			            System.out.println("Element updated successfully");
			        } 
			        else 
			        {
			            System.out.println("Element not found");
			        }
			    }
			    break;
			    
			case 6:
				System.out.println("Existing the program");
				sc.close();
				System.exit(0);
				
				default:
					System.out.println("Invalid choice");
			    
			    
			}
		}
	}
}
