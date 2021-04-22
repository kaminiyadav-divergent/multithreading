package com.divegent.multithreading;

/**
 * 
 * @author Dell
 *
 */
public class InterruptMethodDemo extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				// once the thread is goes into sleeping mode then thread will interrupt
				// because of interrupt method
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println("Thread interrupted Exception: " + e);
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		InterruptMethodDemo ie = new InterruptMethodDemo();
		ie.start();
		// interrupt method interrupt the thread
		ie.interrupt();

	}

}
