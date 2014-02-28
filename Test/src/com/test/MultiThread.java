package com.test;

public class MultiThread {
	
	public static synchronized void method1() {
		System.out.println("1");
		System.out.println("method1 calling");
	}
	
	public static synchronized void method2() {
		System.out.println("2");
		System.out.println("method2 calling");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final MultiThread multi = new MultiThread();	
		final MultiThread multi1 = new MultiThread();
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				multi.method1();				
			}
		};
		
		Runnable t2 = new Runnable() {
			
			@Override
			public void run() {
				multi1.method2();				
			}
		};
		new Thread(t1).start();
		new Thread(t2).start();
	}
	

}
