package com.divegent.multithreading;
/**
 * 
 * @author Dell
 *
 */
public class YieldMethodDemo extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {

			// these first
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " - " + i);

		}
	}
/**
 * 
 * 
 * 
 * @param args
 */
	public static void main(String[] args) {
		YieldMethodDemo y = new YieldMethodDemo();
		y.start();
		// If you want main method to stop and provide chance to other threads for
		// execution
		// Thread.yield();
		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " - " + i);
		}

	}

}
