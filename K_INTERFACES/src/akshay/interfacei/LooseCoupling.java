package akshay.interfacei;

import java.util.Scanner;

interface HotDrink
{
	void prepare();
}

class Tea implements HotDrink
{
	@Override
	public void prepare() 
	{
		System.out.println("Preparing Hyderabad Irani Tea.");
	}
}

class Cofee implements HotDrink
{
	@Override
	public void prepare() 
	{
		System.out.println("Prepare Amravti cofee.");
	}
}

class Boost implements HotDrink
{
	@Override
	public void prepare() 
	{
		System.out.println("prepare boost from begamPeth.");
	}
}

class Restorent
{
	public static void prepareHotDrinks(HotDrink drinks)
	{
		drinks.prepare();
	}
}
public class LooseCoupling 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("1.Tea");
		System.out.println("2.Cofee");
		System.out.println("3.Boost");
		System.out.println("Choose one :- ");
		
		int choice = sc.nextInt();
		

		switch (choice)
		{
		case 1:
			Restorent.prepareHotDrinks(new Tea());
			break;
			
		case 2:
			Restorent.prepareHotDrinks(new Cofee());
			break;
			
		case 3:
			Restorent.prepareHotDrinks(new Boost());
			break;
			
			default:
				System.err.println("Invalid choice");
			
		}
		sc.close();

	}

}
