package com.test.armstrongNum;

public class TestNum {

	/**
	 * Sum of Cube of num is equal to num , a*a*a + b*b*b + c*c*c = abc 
	 */
	public static void main(String[] args) {
		int num =  370;
		if(check(num))
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");
		checkNum(1,500);

	}
	public static boolean check(int n){
		int original = n;
		int tmp =0,a=0;
		while(n>0){
			a= n%10;  //3 5 1
			tmp += a*a*a; //27+125+1
			n =  n/10; //15 1 0
		}
		//System.out.println(tmp);
		if(original == tmp)
			return true;
		else
		  return false;
	}
	public static void checkNum(int m, int n){
		for(int i=m;i<=n;i++){
			if(check(i))
				System.out.println(i+" ");
		}
	}

}
