package akshay.singlelevel;

class Super
{
	private int x,y;
	
	public void setData(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getx()
	{
		return x;
	}
	
	public int gety()
	{
		return y;
	}
	
}

class Sub extends Super
{
	public void showData()
	{
		System.out.println("x value is = "+getx());
		System.out.println("y value is = "+gety());
	}
}

public class SingleLevelInheritance 
{

	public static void main(String[] args) 
	{
		Sub sub = new Sub();
		sub.setData(100, 200);
		sub.showData();
	}

}
