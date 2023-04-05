package com.thread;
/*
 * Thread:
 * 1. it is a light weight process
 */

class First extends Thread{

	public void run() {
		for (int i = 0; i <=5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My first thread is..."+i);
		}
		System.out.println("first thread completed");
	}

	
}	


public class ThreadDemo {
	public static void main(String[] args) {
//		Thread t1 = Thread.currentThread();;
//		
//		t1.setName("java class");
//		System.out.println(t1);
		
		First f1 = new First();
		f1.start();
		
		for (int i = 0; i <=5; i++) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("My mainthread is..."+i);
		}
		System.out.println("main thread completed");
		
	}
}
