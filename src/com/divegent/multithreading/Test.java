package com.divegent.multithreading;

public class Test extends Thread {
	// @override the run method
	public void run() {
		// thread task
		System.out.println("Thead Task..");
	}

	public static void main(String[] args) {
		// create a object of test
		Test t = new Test();

		// start the thread, invoke the thread
		t.start();
		// t.start(); Exception cannot invoke again
	}

}
