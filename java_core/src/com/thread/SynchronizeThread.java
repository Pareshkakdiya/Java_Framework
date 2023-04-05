package com.thread;

class CallBack{
	public void call(String msg) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.print("["+msg);
		System.out.println("]");
	}
}

class MyThread implements Runnable{
	Thread t;
	CallBack c;
	String msg;
	
    public MyThread(String msg, CallBack c) {
    	this.c = c;
    	this.msg = msg;
	    t = new Thread(this);
	    t.start();
	}
	@Override
	public void run() {
		synchronized (c) {
			c.call(msg);
		}
	}
	
}

public class SynchronizeThread {
public static void main(String[] args) {
	CallBack c = new CallBack();
	MyThread t1 = new MyThread("Hello", c);
	MyThread t2 = new MyThread("World", c);
	MyThread t3 = new MyThread("Sychronization", c);
}
}
