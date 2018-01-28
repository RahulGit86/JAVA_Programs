package com.test;

public class JavaCachingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//till 127 values are stroed in cache so new object also point to same memory location
		//For 128 or greater value , objects are created in pool , it is not stored in cache 
		//For Integer , Byte, Short, Long : from(-127 to 127) stored in cache 
		//For Character, from (0 -127) stored in cache
		//Float, Double does not have cache value , new object will store in new memory location
        Integer i1 = 127;
        Integer i2 = 127;
        if(i1==i2)
        	System.out.println("true");
        else
        	System.out.println("false");
        Integer i3 = 128;
        Integer i4 = 128;
        if(i3==i4)
        	System.out.println("true");
        else
        	System.out.println("false");
        Float f1 = 126.1f;
        Float f2 = 126.1f;
        if(f1==f2)
        	System.out.println("true");
        else
        	System.out.println("false");
	}

}
