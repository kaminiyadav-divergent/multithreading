package com.divegent.multithreading;

/**
 * 
 * @author Dell
 *
 */
public class ThreadPriorityDemo extends Thread {
	@Override
	public void run() {
		System.out.println("child thread priority : ");

		System.out.println(Thread.currentThread().getPriority());

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// It will get current thread priority
		// i.e. main thread priority
		System.out.println("Default Priority : " + Thread.currentThread().getPriority());

		// set the current Thread priority
		Thread.currentThread().setPriority(8);

		System.out.println("After set the Priority : " + Thread.currentThread().getPriority());

		// Thread created
		ThreadPriorityDemo t = new ThreadPriorityDemo();

		t.setPriority(MAX_PRIORITY);
		// thread start
		t.start();

	}

}
