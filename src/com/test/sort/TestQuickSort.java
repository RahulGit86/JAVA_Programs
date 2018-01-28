package com.test.sort;

public class TestQuickSort {

	/**
	 * Quick sort is recursive 
	 * it is divide and conquer algorithm very efficient
	 * for large data set BIG O analysis, worst : O(n*n) , average : O(nlogn),it depends on pivot value selection 
	 * First choose pivot value, move short from pivot to left side & move big from pivot to right side
	 * maintain left & right pointer, if left pointer value is bigger & right pointer value is smaller than pivot then swap left & right pointer values
	 * if left pointer value is not bigger than pivot, move left pointer by 1 & if right pointer value is not smaller than pivot, move right pointer by 1 
	 * do above activity till both pointer reached same index, then swap this index & pivot value
	 * Now pivot is at right position , we have left partition having smaller value then pivot & right partition having bigger than pivot
	 * then recursively call method for left partition & right partition
	 * 
	 */
	public static int[] arr =  { 1, 6, -1, 8, -3, 9, 0, 2, -2, 3 };
	//public static int[] arr =  {51, 11, 12, 13, 21, 14, 50, 35, 37, 35}; 

	public static void main(String[] args) {
		printArray(arr);
		quickSort(0, 9);
		System.out.println();
		printArray(arr);
	}
	public static void quickSort(int left, int right) {
		if (right - left <= 0)
			return;
		else {
			int pivot = arr[right];
			int pivotLocation = partition(left, right, pivot);
			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);
		}
	}
	public static int partition(int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;

		while (true) {
			while (arr[++leftPointer] < pivot);
			while (rightPointer > 0 && arr[--rightPointer] > pivot);
			if (leftPointer >= rightPointer) {
				break;
			} else {
				swapValues(leftPointer, rightPointer);
			}
		}
		swapValues(leftPointer, right);
		return leftPointer;
	}
	public static void swapValues(int i, int j) {
		int k = arr[i];
		arr[i] = arr[j];
		arr[j] = k;
	}
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
