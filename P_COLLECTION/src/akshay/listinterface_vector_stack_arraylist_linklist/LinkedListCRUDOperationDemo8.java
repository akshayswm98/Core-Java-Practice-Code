package akshay.listinterface_vector_stack_arraylist_linklist;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCRUDOperationDemo8
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n------ LinkedList Menu ------");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Update Element");
            System.out.println("4. Search Element");
            System.out.println("5. Display Elements");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch(choice)
            {
            case 1: // Insert
                System.out.print("Enter Element To Insert: ");
                int add = Integer.parseInt(sc.nextLine());
                list.add(add);
                System.out.println(add + " Added Successfully.");
                break;

            case 2: // Delete
                if(list.isEmpty())
                {
                    System.err.println("List Is Empty.");
                }
                else
                {
                    System.out.print("Enter Element To Delete: ");
                    int delete = Integer.parseInt(sc.nextLine());

                    if(list.remove(Integer.valueOf(delete)))
                        System.out.println(delete + " Deleted Successfully.");
                    else
                        System.err.println("Element Not Found.");
                }
                break;

            case 3: // Update
                if(list.isEmpty())
                {
                    System.err.println("List Is Empty.");
                }
                else
                {
                    System.out.print("Enter Element To Update: ");
                    int oldElement = Integer.parseInt(sc.nextLine());

                    int index = list.indexOf(oldElement);

                    if(index != -1)
                    {
                        System.out.print("Enter New Element: ");
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

            case 4: // Search
                System.out.print("Enter Element To Search: ");
                int search = Integer.parseInt(sc.nextLine());

                if(list.contains(search))
                    System.out.println(search + " Found In List.");
                else
                    System.err.println(search + " Not Found.");
                break;

            case 5: // Display
                if(list.isEmpty())
                {
                    System.err.println("List Is Empty.");
                }
                else
                {
                    System.out.println("Elements In LinkedList:");
                    list.forEach(System.out::println);
                }
                break;

            case 6: // Exit
                System.out.println("Program Exit.");
                sc.close();
                System.exit(0);

            default:
                System.err.println("Invalid Choice. Try Again.");
            }
        }
    }
}