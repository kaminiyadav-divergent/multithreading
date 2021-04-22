package com.divegent.multithreading;

public class SleepMethodDemo extends Thread {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {

			try {
				// it will send main thread to sleep
				// it is static method
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i);

		}

	}

}
