package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.Collections;
import java.util.Vector;

record Employee(Integer id, String name, Double salary)
{
}

public class VectorDemo7 
{
    public static void main(String[] args) 
    {
        Vector<Employee> listOfEmployee = new Vector<>();
        listOfEmployee.add(new Employee(333, "Akshay", 30000D));
        listOfEmployee.add(new Employee(313, "Rajesh", 40000D));
        listOfEmployee.add(new Employee(343, "Pawan", 20000D));
        listOfEmployee.add(new Employee(334, "Prajwal", 10000D));
        listOfEmployee.add(new Employee(203, "Vaishnavi", 30000D));
        listOfEmployee.add(new Employee(102, "Rutuja", 50000D));
        
        System.out.println("Original Employee Data");
        System.out.println(listOfEmployee);

        // Sorting based on Employee ID (ascending)
        Collections.sort(listOfEmployee, (e1, e2) -> e1.id().compareTo(e2.id()));
        
        System.out.println("Sorted by ID (Ascending):");
        System.out.println(listOfEmployee);
    }
}