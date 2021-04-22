package com.divegent.multithreading;

/**
 * 
 * @author Dell
 *
 */
public class JoinMethodDemo extends Thread {
	static Thread mainthread;

	public void run() {
		try {
			// mainthread.join();
			for (int i = 0; i <= 5; i++) {
				System.out.println("child thread: " + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// Reference of main thread
		mainthread = Thread.currentThread();
		JoinMethodDemo j = new JoinMethodDemo();
		j.start();
		// now main thread will taut for j thread
		j.join();
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("main thread: " + i);
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
