package com.test.fact;

public class TestFact {

	public static void main(String[] args) {
		int n =  6;
		cal(n);
		System.out.println(calRec(n));
	}
	public static void cal(int n){
		int rest = 1;
		while(n!=1){
			rest *= n;
			n--;
		}
		System.out.println("fact:"+rest);
	}
	public static int calRec(int n){
		if(n==1)
			return n;
		else
			return n * calRec(n-1);
	}

}
