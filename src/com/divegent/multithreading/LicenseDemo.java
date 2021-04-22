package com.divegent.multithreading;
/**
 * demo of process of license
 * using join method 
 * @author Dell
 *first is a medical test
 */
class Medical extends Thread {
	public void run() {
		try {
			
			System.out.println("Medical Test ");
			Thread.sleep(2000);
			System.out.println("Medical Test Completed ");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
/**
 * 
 * @author Dell
 *second there will be Driving test
 */
class DrivingTest extends Thread {
	public void run() {
		try {
			System.out.println("Driving Test ");
			Thread.sleep(2000);
			System.out.println("Driving Test Completed ");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
/**
 * Third will be Officer Signature
 * @author Dell
 *
 */
class OfficerSign extends Thread {
	public void run() {
		try {
			System.out.println("Officer Signature ");
			Thread.sleep(2000);
			System.out.println("officersignature done ");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
/**
 * 
 * @author Dell
 *
 */
public class LicenseDemo extends Thread {
/**
 * 
 * @param args
 * @throws InterruptedException 
 */
	public static void main(String[] args) throws InterruptedException {
		Medical m = new Medical();
		m.start();
		
		m.join();
		
		DrivingTest d = new DrivingTest();
		d.start();
		
		d.join();
		
		OfficerSign os = new OfficerSign();
		os.start();
		
		os.join();

	}

}
