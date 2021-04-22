package com.divegent.multithreading;

class BookThreaterSeat {
	int total_seats = 10;

	/**
	 * synchronized method is used to access only one thread at a time
	 * 
	 * @param seats Every object has it's own lock
	 */
	synchronized void bookSeat(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + " seats booked successfully");
			total_seats = total_seats - seats;
			System.out.println("seats Left : " + total_seats);
		} else {
			System.out.println("seats cannot be booked  .....!");
			System.out.println("seats Left : " + total_seats);
		}
	}
}

/**
 * 
 * @author Dell
 *
 */
public class MovieBookAppSynconizedDemo extends Thread {
	// creating static reference
	static BookThreaterSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		b = new BookThreaterSeat();

		MovieBookAppSynconizedDemo kamini = new MovieBookAppSynconizedDemo();
		kamini.seats = 4;
		kamini.start();

		MovieBookAppSynconizedDemo kiran = new MovieBookAppSynconizedDemo();
		kiran.seats = 6;
		kiran.start();
	}
}
