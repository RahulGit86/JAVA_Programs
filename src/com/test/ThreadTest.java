package com.test;

public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final class Constants{
			//public static  String name = "PI";  //Static is possible inside non static , compile time error
			public static final String name = "PI";  //Static is possible inside non static , if it is constant expression
		}
       Thread thread = new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println(Constants.name);
			System.out.println("running");
			
		}
	   });
       thread.start();
	}

}
