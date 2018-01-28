package com.test.array;

public class TestFind3rdMaxElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []arr = {1,2,5,6,3,2};
		int findElem =3;
		for(int i : arr){
			System.out.print(i+" ");
		}
		System.out.println();
		int []arr1 = sortElementsAsending(arr);
		for(int i : arr1){
			System.out.print(i+" ");
		}
		System.out.println();
		int []arr2 = sortElementsDesending(arr);
		for(int i : arr2){
			System.out.print(i+" ");
		}
		System.out.println("\n"+findElem+ "nd largest element:"+arr2[findElem-1]);

	}
	public static int[] sortElementsAsending(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j-1]>arr[j]){
					int tmp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]=tmp;
				}
			}
		}
		return arr;
	}
	public static int[] sortElementsDesending(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int tmp = arr[j];
					arr[j]= arr[i];
					arr[i]=tmp;
				}
			}
		}
		return arr;
	}
}
