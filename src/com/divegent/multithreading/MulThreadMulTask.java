package com.divegent.multithreading;

class Testt extends Thread {
	public void run() {
		System.out.println("Timer ");
	}

}

class Test3 extends Thread {
	public void run() {
		System.out.println("Play Audio ");
	}

}

class Video extends Thread {
	public void run() {
		System.out.println("Play Video");
	}
}

class Audio extends Thread {
	public void run() {
		System.out.println("Play Audio");
	}
}

public class MulThreadMulTask {
	public static void main(String[] args) {
		Testt obj = new Testt();
		Test3 obj1 = new Test3();
		Video obj2 = new Video();
		Audio obj3 = new Audio();

		obj.start();
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
