package com.divegent.multithreading;

/**
 * 
 * @author Dell
 *
 */
public class DaemonThreadDemo extends Thread {
	public void run() {

		if ((Thread.currentThread().isDaemon())) {
			System.out.println("demon thread");
		}

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("main thread");

		DaemonThreadDemo d = new DaemonThreadDemo();

		d.setDaemon(true);

		d.start();

	}

}
