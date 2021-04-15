package com.divegent.multithreading;

public class TestInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Creation of Thread using Runnable interface");
	}

	public static void main(String[] args) {
		// create an object of class
		TestInterface t = new TestInterface();

		// Create an object of thread class & pass the parameter in constructor
		Thread th = new Thread(t);

		// invoke the thread
		th.start();

	}

}
