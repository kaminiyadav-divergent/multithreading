package com.divegent.multithreading;

public class InterruptMethodDemo1 extends Thread {

	public void run() {
		// System.out.println("A1 : "+Thread.interrupted());// true->false(interrupted
		// status)
		// System.out.println("A2 : "+Thread.interrupted());// false(interrupted status)

		System.out.println("B1 : " + Thread.currentThread().isInterrupted()); // true->true
		System.out.println("B2 : " + Thread.currentThread().isInterrupted()); // true->true
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				// once the thread is goes into sleeping mode then thread will interrupt
				// because of interrupt method
				Thread.sleep(1000);
				// System.out.println("B : " + Thread.interrupted());
			}

		} catch (Exception e) {
			System.out.println("Thread interrupted Exception: " + e);
		}

	}

	public static void main(String[] args) {
		InterruptMethodDemo1 it = new InterruptMethodDemo1();
		it.start();
		it.interrupt();
	}

}
