package akshay.ravi_sir_program;

class Table
{
	synchronized void printTable(int num)
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(num+ " x "+i+" = "+(num*i));
				Thread.sleep(1000);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}

public class SynchronnizationMethodLevel1 extends Thread
{
	static Table t;
	int num ;
	@Override
	public void run() 
	{
		t.printTable(num);
	}
	
	public static void main(String[] args) 
	{
		t = new Table();
		
		SynchronnizationMethodLevel1 s = new SynchronnizationMethodLevel1();
		s.num = 7;
		s.start();
		
		SynchronnizationMethodLevel1 s1 = new SynchronnizationMethodLevel1();
		s1.num = 8;
		s1.start();
	}

}
