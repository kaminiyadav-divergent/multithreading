package com.divegent.multithreading;

class BookSeat {
	static int total_seats = 20;

	synchronized static void bookSeat(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + " Seats Booked Successfylly ");
			total_seats = total_seats - seats;
			System.out.println("seats left : " + total_seats);
		} else {
			System.out.println("Seats cannot be Booked ");
			System.out.println("seats left : " + total_seats);
		}
	}
}

class MyThread1 extends Thread {
	BookSeat b;
	int seats;

	MyThread1(BookSeat b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.bookSeat(seats);
	}
}

class MyThread2 extends Thread {
	BookSeat b;
	int seats;

	MyThread2(BookSeat b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.bookSeat(seats);
	}
}

public class StaticSyncronizedDemo {

	public static void main(String[] args) {

		BookSeat b1 = new BookSeat();

		MyThread1 t1 = new MyThread1(b1, 5);
		t1.start();

		MyThread2 t2 = new MyThread2(b1, 8);
		t2.start();

		// ...........................

		BookSeat b2 = new BookSeat();

		MyThread1 t3 = new MyThread1(b2, 7);
		t3.start();

		MyThread2 t4 = new MyThread2(b2, 9);
		t4.start();

	}

}
