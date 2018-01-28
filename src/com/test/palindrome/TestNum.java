package com.test.palindrome;

public class TestNum {

	public static void main(String[] args) {
		int n =  1126211;
		if(checkNum(n)){
			System.out.println("palindrome number");
		}else{
			System.out.println("not palindrome number");
		}
	}
	public static boolean checkNum(int num){
		int tmp =0, rem=0;
		int ori = num;
		boolean flag  = false;
		while(num>0){
			rem =  num%10; // 0
			tmp = tmp*10 + rem ; //2 22 221
			num =  num / 10 ; // 12  1 0
			
		}
		System.out.println(tmp);
		if(ori == tmp)
			flag  = true;
		else
			flag  = false;
		
		return flag;
	}

}
