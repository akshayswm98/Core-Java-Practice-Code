package akshay.multilevelInheritance;

import java.util.Scanner;

class Animel
{
	public void eat()
	{
		System.out.println("Animel Is Eating");
	}
}

class Mammal extends Animel
{
	public void walk()
	{
		System.out.println("Mammal Is Wlking");
	}
}

class Dog extends Mammal
{
	public void bark()
	{
		System.out.println("Dog Is Barking");
	}
}

public class AnimelDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		System.out.println("choose an action");
		System.out.println("1.Animel is eat");
		System.out.println("2.Mammal Is walking");
		System.out.println("3.Dog is barking");
		System.out.println("Enter your choice(1.3)");
		
		switch(choice)
		{
		case 1:
				Animel a = new Animel();
				a.eat();
				break;
				
		case 2:
				Mammal m = new Mammal();
				m.walk();
				break;
				
		case 3:
				Dog d = new Dog();
				d.bark();
				break;
		default:
				System.out.println("Invalid Choice..!");
		}
		sc.close();
		
	}

}
