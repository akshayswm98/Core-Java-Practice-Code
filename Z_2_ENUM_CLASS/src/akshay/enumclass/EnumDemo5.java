package akshay.enumclass;

interface Moveable
{
	void move();
}
class Hello
{
	int x = 100;
}

enum Direction implements Moveable
{
	EAST,WEAST,NORTH,SOUTH;
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}
class EnumDemo5
{
	public static void main(String[] args) 
	{
		System.out.println(Direction.EAST);
	}
}
