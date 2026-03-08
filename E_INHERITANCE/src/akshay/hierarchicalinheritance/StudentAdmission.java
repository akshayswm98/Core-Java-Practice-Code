package akshay.hierarchicalinheritance;

import java.util.Scanner;


class Student1 
{
    protected String name;
    protected String className;

    public Student1(String name, String className) 
    {
        this.name = name;
        this.className = className;
    }
}

class Science1 extends Student1 
{
    protected String sub1;
    protected String sub2;
    protected String commonSub;

    public Science1(String name, String className, String sub1, String sub2, String commonSub) 
    {
        super(name, className);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.commonSub = commonSub;
    }

    public void showResult() 
    {
        System.out.println("=== Science Student Admission ===");
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Common Subject: " + commonSub);
    }
}

class Marathi1 extends Student1 
{
    protected String sub1;
    protected String sub2;
    protected String commonSub;

    public Marathi1(String name, String className, String sub1, String sub2, String commonSub) 
    {
        super(name, className);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.commonSub = commonSub;
    }

    public void showResult() 
    {
        System.out.println("=== Marathi Student Admission ===");
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Common Subject: " + commonSub);
    }
}

public class StudentAdmission 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose one option:");
        System.out.println("1. Science Admission");
        System.out.println("2. Marathi Medium Admission");
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) 
        {
            case 1:
                System.out.print("Enter Student Name: ");
                String sName = sc.nextLine().toUpperCase();

                System.out.print("Enter Class Name: ");
                String sClass = sc.nextLine().toUpperCase();

                System.out.print("Enter Subject 1: ");
                String sSub1 = sc.nextLine().toUpperCase();

                System.out.print("Enter Subject 2: ");
                String sSub2 = sc.nextLine().toUpperCase();

                System.out.print("Enter Common Subject: ");
                String sCommon = sc.nextLine().toUpperCase();

                Science1 sci = new Science1(sName, sClass, sSub1, sSub2, sCommon);
                sci.showResult();
                break;

            case 2:
                System.out.print("Enter Student Name: ");
                String mName = sc.nextLine().toUpperCase();

                System.out.print("Enter Class Name: ");
                String mClass = sc.nextLine().toUpperCase();

                System.out.print("Enter Subject 1: ");
                String mSub1 = sc.nextLine().toUpperCase();

                System.out.print("Enter Subject 2: ");
                String mSub2 = sc.nextLine();

                System.out.print("Enter Common Subject: ");
                String mCommon = sc.nextLine().toUpperCase();

                Marathi1 mar = new Marathi1(mName, mClass, mSub1, mSub2, mCommon);
                mar.showResult();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
