package akshay.synchronized_method_block_staticsynchronized;


class MovieBooking
{
	int availableSeat = 10;
	
	
	synchronized void bookShow(int seat)
	{
		
		String name = Thread.currentThread().getName();
		if(availableSeat >= seat)
		{
			System.out.println(name + " " + seat + " Seat Book Succesfully...!");
			availableSeat = availableSeat - seat;
			System.out.println("Available Seat Is : " + availableSeat);
		}
		else
		{
			System.err.println(name + " Seats Is Not Available...!");
		}
	}
}


public class MovieBookingAppSyncronizationMethod2 extends Thread
{
	static MovieBooking b;
	int seats;
	
	
	public MovieBookingAppSyncronizationMethod2(int seats) 
	{
		super();
		this.seats = seats;
	}
	
	@Override
	public void run() 
	{
		b.bookShow(seats);
	}


	public static void main(String[] args) 
	{
		b = new MovieBooking();
		
		MovieBookingAppSyncronizationMethod2 t1 = new MovieBookingAppSyncronizationMethod2(7);
		MovieBookingAppSyncronizationMethod2 t2 = new MovieBookingAppSyncronizationMethod2(6);
		
		t1.setName("Akshay");
		t2.setName("Ravi");
		
		t1.start();
		t2.start();
		
	}

}
