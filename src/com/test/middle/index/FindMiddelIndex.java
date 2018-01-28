package com.test.middle.index;

public class FindMiddelIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] ={1,3,4,2,4,2,2};
         System.out.println(findIndex(arr));
	}
	public static int findIndex(int[] arr){
		int index = 0;
		int startIndex  =0;
		int endIndex = arr.length -1;
		int sumStartIndex = 0;
		int sumEndIndex = 0;
		for(int i = 0; i<arr.length ; i++){
			if(sumStartIndex<sumEndIndex)
			  sumStartIndex+= arr[startIndex++];
			else				
				sumEndIndex += arr[endIndex--];
			if(startIndex >endIndex){
				if(sumStartIndex ==sumEndIndex){
					break;
				}
			}
		}
		return endIndex;
	}

}
