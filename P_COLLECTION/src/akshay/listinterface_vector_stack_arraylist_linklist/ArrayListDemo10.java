package akshay.listinterface_vector_stack_arraylist_linklist;

import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specializaton)
{
	
}
class Department
{
	private String departmentName;
	private List<Professor> professors;
	
	public Department(String department)
	{
		this.departmentName = departmentName;
		professors = new  ArrayList<Professor>();
	}
	
	public void addProfessor(Professor professor)
	{
		professors.add(professor);
	}
	public String getDepartmentName()
	{
		return this.departmentName;
	}
	
	public List<Professor> getProfessors()
	{
		return this.professors;
	}
	
	
}
public class ArrayListDemo10 
{
	public static void main(String[] args) 
	{
		Department dept = new Department("Computer Science");
		dept.addProfessor(new Professor("Mr james","Java"));
		dept.addProfessor(new Professor("Mr Scott","Python"));
		dept.addProfessor(new Professor("Mr james","Java"));
		
		System.out.println("The Professor which are in : "+dept.getDepartmentName()+ "department");
		
		dept.getProfessors().forEach(System.out::println);
		
		Department civil = new Department("Civil Engineer");
		civil.addProfessor(new Professor("Mr Alen", "Engineer Draving"));
		civil.addProfessor(new Professor("Mr John", "UML"));
		civil.addProfessor(new Professor("Mr Scott", "Draving"));
		
		System.out.println("The professor which are in :"+civil.getDepartmentName()+"department");
		
		civil.getProfessors().forEach(System.out::println);
	}
}
