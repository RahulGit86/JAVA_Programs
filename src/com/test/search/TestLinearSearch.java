package com.test.search;

public class TestLinearSearch {

	/**
	 * Linear search is used to search a key element from multiple elements. 
	 * Linear search is less used today because it is slower than binary search and hashing.
	 * If have duplicate elements then linear search is used instead of binary serach
	 */
	public static void main(String[] args) {
		 int[] a1= {10,20,30,50,70,90,50,40,50,10,50};    
	     int key = 50;
	     System.out.println(searchFirstIndex(key,a1));
	     System.out.println(searchAllIndex(key,a1));
	}
	public static int searchFirstIndex(int n,int[] arr){
		int index = -1;
		for(int i =0;i<arr.length;i++){
			if(n == arr[i]){
				index = i;
				break;
			}
		}
		return index;
	}
	public static String searchAllIndex(int n,int[] arr){
		String matchedIndex = "";
		boolean matched =  false;
		for(int i =0;i<arr.length;i++){
			if(n == arr[i]){
				 matched =  true;
				 matchedIndex+=i+" ";
			}
		}
		if(!matched){
			matchedIndex = "None";
		}
		return matchedIndex;
	}

}
