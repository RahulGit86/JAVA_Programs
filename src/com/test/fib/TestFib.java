package com.test.fib;

public class TestFib {
	static int a1 = 0,b1=1,c1=0;

	public static void main(String[] args) {
		int num = 10;
		calculateFib(num);
		System.out.println();
		System.out.print(a1 +" "+b1+" ");
		calculateFibRec(num -2);
		System.out.println();
		System.out.println(calculateFibRec1(6));
	}
	public static void calculateFib(int n){
		int a = 0,b=1,c=0;
		System.out.print(a +" "+b+" ");
		for(int i=0;i<n-2;i++){
			c= a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void calculateFibRec(int n){
		if(n>0){
			c1 = a1 +b1;
			System.out.print(c1+" ");
			a1=b1;
			b1=c1;
			calculateFibRec(n-1);
		}		
	}
	public static int calculateFibRec1(int n){
		if(n<2){
			//System.out.println(n +" ");
			return n;
		}		
		return calculateFibRec1(n-2) +calculateFibRec1(n-1);
	}
}
