package com.test.thread;

public class JAVAThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JAVAThread obj = new JAVAThread();
		Thread obj1 = new Thread(new JAVAThread());
		obj1.start();
		obj.start();
		obj.start();
	}
	
	public void run(){
		System.out.println("come in run method");
	}

}
