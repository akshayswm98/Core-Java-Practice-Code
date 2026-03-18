package akshay.serialization_dserialization;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

class Employee implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int id;          // removed transient
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(int id, String name, double salary, LocalDate hireDate)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public static Employee getEmployeeObject()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        LocalDate date = LocalDate.now();

        return new Employee(id, name, salary, date);
    }

    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", name=" + name +
               ", salary=" + salary + ", hireDate=" + hireDate + "]";
    }
}
