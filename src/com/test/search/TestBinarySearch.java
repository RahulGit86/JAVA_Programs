package com.test.search;

public class TestBinarySearch {

	/**
	 * Binary search is used to search a key element from multiple elements. 
	 * Binary search is faster than linear search.
       In case of binary search, array elements must be in sorted order. 
       If you have unsorted array, you can sort the array using Arrays.sort(arr) method.
	 */
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60};  
        int key = 10;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key); 

	}
	public static void binarySearch(int[] arr,int first,int last, int key){
		int mid  =  (first+last)/2;//2
		while(first<=last){
			if(key ==arr[mid]){//40 30
				System.out.println(key +" is at index: "+mid);
				break;
			}else if(key > arr[mid]){
			  	first = mid+1;
			}
			else{
				last =  mid-1;
			}
			mid  = (first+last)/2;
		}
		if(first>last){
			System.out.println("Element is not found");
		}
	}	
}
