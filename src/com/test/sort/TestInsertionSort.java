package com.test.sort;

public class TestInsertionSort {

	/**
	 * We can create a java program to sort array elements using insertion sort. 
	 * Insertion is good for small elements only because it requires more time (due to nesting search) for sorting large number of elements.
	 * element to left of current elements should be small
	 * index 0 , there is no bigger element
	 * So we start at index 1,
	 * Compare current element till 0 index , if current is less then immediate last one then swap elements
	 */
	public static int[] arr = { 1, 6, -1, 8, -3, 9, 0, 2, -2, 3 };
	public static void main(String[] args) {
		printArray(arr);
		insertionSort();
		System.out.println();
		printArray(arr);
	}
	public static void insertionSort(){
		for(int i=1;i<arr.length;i++){
			int j=i;
			/*while(j>0 && (arr[j-1] > arr[j])){
				int tmp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j]=tmp;
				j--;
			}*/
			int insertValue = arr[j];
			while(j>0 && (arr[j-1] > insertValue)){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=insertValue;
		}
	}
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
