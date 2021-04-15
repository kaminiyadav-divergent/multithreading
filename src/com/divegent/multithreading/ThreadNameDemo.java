package com.divegent.multithreading;

/**
 * 
 * @author Dell
 *
 */
public class ThreadNameDemo {
/**
 * 
 * 
 * @param args
 */
	public static void main(String[] args) {
		//main thread created by jvm
		System.out.println("hello");

		// it will give current thread
		System.out.println(Thread.currentThread().getName());// main

		// It will set name of thread. 
		Thread.currentThread().setName("kamini");
		System.out.println("New Thread Name :" + Thread.currentThread().getName());
		
		//it will return boolean value
		System.out.println(Thread.currentThread().isAlive());
	}

}
