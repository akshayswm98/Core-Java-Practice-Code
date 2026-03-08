package akshay.synchronized_method_block_staticsynchronized;

class BookTheaterSeats2
{
	int totalSeats = 10;
	void bookSeat(int seats)
	{
		synchronized (this) //Synchronized block.
		{
			if(totalSeats >= seats)
			{
				System.out.println(seats+" Seats Book Succesfully..!");
				totalSeats = totalSeats - seats;
				System.out.println("Seats Left "+totalSeats);
			}
			else
			{
				System.err.println("Sorry.Seats Can Not Be book..!");
				System.out.println("Seats Left "+totalSeats);
			}
		}
	}
}

public class MovieBookingApp1SynchronizeBlock1 extends Thread
{
	static BookTheaterSeats2 b;
	int seats;
	@Override
	public void run() 
	{
		b.bookSeat(seats);
	}
	
	public static void main(String[] args) 
	{
		b = new BookTheaterSeats2();
		
		MovieBookingApp1SynchronizeBlock1 akshay = new MovieBookingApp1SynchronizeBlock1();
		akshay.seats = 7;
		
		
		
		
		MovieBookingApp1SynchronizeBlock1 kunal = new MovieBookingApp1SynchronizeBlock1();
		kunal.seats = 6;
		
		kunal.start();
		akshay.start();
		
		
		
		
	}

}


/*Advantage of block we will provide needed code in that block no need to cover all method synchronized
 * synchronized block is the better option as compared method.for control accessibility of multiple thread.*/
