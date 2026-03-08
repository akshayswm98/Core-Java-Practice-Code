package akshay.synchronized_method_block_staticsynchronized;

class BookTheaterSeats1
{
	int totalSeats = 10;
	synchronized void bookSeat(int seats)//Synchronized method declare only with keywords.
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



public class MovieBookingApp1SynchronizeMethod extends Thread
{
	static BookTheaterSeats1 b;
	int seats;
	@Override
	public void run() 
	{
		b.bookSeat(seats);
	}
	
	public static void main(String[] args) 
	{
		b = new BookTheaterSeats1();
		
		MovieBookingApp1SynchronizeMethod akshay = new MovieBookingApp1SynchronizeMethod();
		akshay.seats = 7;
		akshay.start();
		
		
		
		MovieBookingApp1SynchronizeMethod kunal = new MovieBookingApp1SynchronizeMethod();
		kunal.seats = 6;
		kunal.start();
		
		
		
	}

}


/*In that case problem is what we will create two thread.
 * both thread intering same time in business method so output provide wrong.
 * so avoid these problem we will use synchronized method.
 =============================================================================================================
 */
 
