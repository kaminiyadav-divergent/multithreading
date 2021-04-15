package com.divegent.multithreading;

public class SingleThreadMulTask extends Thread {
	// @override the run method
	public void run() {
		// thread task
		System.out.println("Thead Task..");
	}

	public static void main(String[] args) {  //main thread(JVM)
		// create a object of test
		SingleThreadMulTask t = new SingleThreadMulTask();
		SingleThreadMulTask t1 = new SingleThreadMulTask();

		// start the thread, invoke the thread
		t.start(); //thread1
		t1.start(); //thread2
	}

}
