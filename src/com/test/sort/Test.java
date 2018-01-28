package com.test.sort;

public class Test {

	public static int[] arr= {1,6,-1,8,-3,9,0,2,-2,3};
	public static void main(String[] args) {
	   printArray(arr);
	   System.out.println();
	   asendingSort(arr);
	   System.out.println();
	   desendingSort(arr);
	}
	public static void asendingSort(int []arr){
		for(int i=0;i<arr.length;i++){			
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j+1] < arr[j]){
					int k = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}				
			}			
		}
		printArray(arr);
	}
	public static void desendingSort(int []arr){
		for(int i=arr.length-1;i>=0;i--){			
			for(int j=arr.length-1-i;j>0;j--){
				if(arr[j-1] < arr[j]){
					int k = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=k;
				}				
			}			
		}
		printArray(arr);
	}
	public static void printArray(int[] arr){
		for(int i:  arr){
			System.out.print(i+" ");
		}
	}

}
