package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo6 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Insert Element.");
			System.out.println("2.Delete Element.");
			System.out.println("3.Update Element.");
			System.out.println("4.Display List");
			System.out.println("5.Exit.");
			System.out.println("Enter The Choice");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
			case 1: // insert element
				System.out.println("Enter The Element To Insert :- ");
				int elementToAdd = Integer.parseInt(sc.nextLine());
				
				list.add(elementToAdd);
				System.out.println(elementToAdd+" Element Added Succesfully.");
				break;
				
			case 2: // delete
				if(list.isEmpty())
				{
					System.err.println("Linked List Is Empty. Element Not Delete");
				}
				else
				{
					System.out.println("Enter The Element For Delete :-");
					int delete = Integer.parseInt(sc.nextLine());
					
					boolean remove = list.remove(Integer.valueOf(delete));
					if(remove)
					{
						System.out.println(delete+" Element Delete Succesfully From List.");
					}
					else
					{
						System.err.println(delete+" Element Is Not Available.");
					}
				}
				break;
				
			case 3: // update
			    if(list.isEmpty())
			    {
			        System.err.println("Linked List Is Empty. Element Not Update");
			    }
			    else
			    {
			        System.out.println("Enter Element To Update :- ");
			        int oldElement = Integer.parseInt(sc.nextLine());

			        int index = list.indexOf(oldElement);

			        if(index != -1)
			        {
			            System.out.println("Enter New Element :- ");
			            int newElement = Integer.parseInt(sc.nextLine());

			            list.set(index, newElement);

			            System.out.println("Element Updated Successfully.");
			        }
			        else
			        {
			            System.err.println("Element Not Found.");
			        }
			    }
			    break;	
				
			case 4: // print
				System.out.println("Element In The Linked List.");
				list.forEach(System.out::println);
				break;
				
			case 5: // exit
				System.out.println("Exit From Linked List.");
				sc.close();
				System.exit(0);
				
			default:
				System.err.println("Invalid Choice. Pls Try Again.");
				
				
			
				
			}	
		}
	}
}
