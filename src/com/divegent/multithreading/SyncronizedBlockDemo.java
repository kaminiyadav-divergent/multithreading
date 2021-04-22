package com.divegent.multithreading;

class BookThreaterSeats {
	int total_seats = 10;

	/**
	 * synchronized block demo
	 * 
	 * @param seats 
	 * Every object has it's own lock
	 */
	void bookSeat(int seats) {
		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());
		System.out.println("hello" + Thread.currentThread().getName());

		// synchronized block which reduces the waiting tie of thread
		synchronized (this) {
			if (total_seats >= seats) {
				System.out.println(seats + " seats booked successfully");
				total_seats = total_seats - seats;
				System.out.println("seats Left : " + total_seats);
			} else {
				System.out.println("seats cannot be booked  .....!");
				System.out.println("seats Left : " + total_seats);
			}
		}

		System.out.println("hii" + Thread.currentThread().getName());
		System.out.println("hii" + Thread.currentThread().getName());
		System.out.println("hii" + Thread.currentThread().getName());
		System.out.println("hii" + Thread.currentThread().getName());
		System.out.println("hii" + Thread.currentThread().getName());

	}
}

public class SyncronizedBlockDemo extends Thread {
	// creating static reference
	static BookThreaterSeats b;
	int seats;

	public void run() {
		b.bookSeat(seats);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		b = new BookThreaterSeats();

		SyncronizedBlockDemo kamini = new SyncronizedBlockDemo();
		kamini.seats = 4;
		kamini.start();

		SyncronizedBlockDemo kiran = new SyncronizedBlockDemo();
		kiran.seats = 6;
		kiran.start();

	}

}
