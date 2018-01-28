package com.test.stati;

public class TestStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			Person person =  new Person();
			System.out.println("instance count:"+person.instanceCount+"   Local count:"+person.localCount);
		}
	}
}
