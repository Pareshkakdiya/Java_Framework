package com.thread;

class Second implements Runnable{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("this is my second thread "+i);
		}
		System.out.println("second thread is completed");
	}
}

public class RunnableDemo {
public static void main(String[] args) {
	Second s1 = new Second();
	Thread t1 = new Thread(s1);
	 
	t1.start();
	System.out.println(t1);
	t1.setName("Paresh");
	t1.setPriority(Thread.MAX_PRIORITY);//1 min, 10 max, 5 normal priority
	System.out.println(t1);
	for (int i = 0; i <= 5; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("this is my main thread "+i);
	}
	System.out.println("main thread is completed");
}
}
