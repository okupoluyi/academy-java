package com.bptn.course._21_multi_threading;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
	}

}
