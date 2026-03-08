package akshay.anonymousinnerclass;
/*If we declare class without any name inside the
 method body is called as anonymous inner class.
*Anonymous inner class ends with terminator(;) and dont have a name.
*THE MAIN PURPOSE OF CLASS TO EXTENDS A CLASS OR IMPLEMENTED AN INTERFACE,ABSTRACTION CLASS.*/

class Super
{
	public void show()
	{
		System.out.println("Super class Show mwthod.");
	}
}
public class AnonymousDemo1 
{

	public static void main(String[] args) 
	{
	//Anonymous inner class	
		Super sub = new Super()
		{
			@Override
			public void show() {
				super.show();
				System.out.println("Sub class show method");
			}
		};
		sub.show();
    }
}
