package com.test.prime;

public class TestPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 11;
		if(checkNum(num)){
			System.out.println(num +" is prime number");
		}else{
			System.out.println(num +" is not prime number");
		}
		cntPrimeNum(2,30);

	}
	public static boolean checkNum(int n){
		for(int i=2;i<n;i++){
				if(n%i == 0){
					return false;
				}
			}
		return true;
	}
	public static void cntPrimeNum(int n, int m){
		int cnt=0;
		for(int j=n;j<=m;j++){
			if(checkNum(j)){
				System.out.print(j+" ");
				cnt++;
			}
		}
		System.out.println("\nTotal prime numbers :"+cnt);
	}

}
