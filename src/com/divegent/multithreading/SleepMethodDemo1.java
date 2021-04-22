package com.divegent.multithreading;

public class SleepMethodDemo1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);

				// Exception timeout value is negative implement in another language
				// Thread.sleep(-1);
				// it is implemented in java
				// these will be runtime exception
				//Thread.sleep(1000, 9999999);
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// thread create
		SleepMethodDemo1 t = new SleepMethodDemo1();
		SleepMethodDemo1 t1 = new SleepMethodDemo1();

		// thread start
		t.start();
		t1.start();

	}

}
