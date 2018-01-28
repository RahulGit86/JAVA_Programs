package com.test;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//\u000d System.out.println("Comments executed");  
		 /** \u000d new line unicode character */
		String str ="One"+1+2+"two";
		System.out.println(str);
		int i= 10 + +11 - -12 + +13  - -14 + +15;
		System.out.println(i);
        String one = "Random";
        String two = "RAndom";
        String three = "Random";
        if(one == two){
        	System.out.println("Equals");
        }else{
        	System.out.println("Not equals");
        }
        if(one == three){ // Both reference pointing to same memory location
        	System.out.println("Equals");
        }else{
        	System.out.println("Not equals");
        }
        String one1 = new String("Random");
        String two1 = new String("RAndom");
        String three1 = new String("Random");
        if(one1 == two1){
        	System.out.println("Equals");
        }else{
        	System.out.println("Not equals");
        }
        if(one1 == three1){ // Both reference pointing to same memory location
        	System.out.println("Equals");
        }else{
        	System.out.println("Not equals");
        }
        System.out.println(Fruit.type);
       
	}

}
