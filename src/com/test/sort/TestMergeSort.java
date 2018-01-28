package com.test.sort;

public class TestMergeSort {
	/*
	 * It is recursive approach It is divide & conquer algorithm, , very
	 * efficient for large data set BIG O analysis : O(n log n)
	 */

	//public static int[] arr = { 4, 2, 1, 2, 4, 8 };
	public static int[] arr = { 1, 6, -1, 8, -3, 9, 0, 2, -2, 3 };
	public static void main(String[] args) {
		printArray(arr);
		printArray(splitArray(arr));		
	}

	public static int[] splitArray(int a[]) {
        int []result = new int[a.length];
		if (a.length == 1)
			return a;
		else {
			int midpoint = a.length / 2;
			int[] left = new int[midpoint];
			int[] right;
			if (a.length % 2 == 0) {
				right = new int[midpoint];
			} else {
				right = new int[midpoint + 1];
			}
			for (int i = 0, k = 0; i < a.length; i++) {
				if (i < a.length / 2) {
					left[i] = a[i];
				} else {
					right[k] = a[i];
					k++;
				}
			}
			left=splitArray(left);
			right=splitArray(right);
			result = merge(result, left, right);
		}
		return result;
	}
	public static int[] merge(int []res, int []left, int []right){
		int restIndex =0;
		int leftIndex =0;
		int rightIndex =0;
		while(leftIndex<left.length || rightIndex < right.length){
			if(leftIndex<left.length && rightIndex<right.length){
				if(left[leftIndex]<=right[rightIndex]){
					res[restIndex]=left[leftIndex];
					leftIndex++;
					restIndex++;
				}else{
					res[restIndex]=right[rightIndex];
					rightIndex++;
					restIndex++;
				}
			}
			else if(leftIndex < left.length){
				res[restIndex]=left[leftIndex];
				leftIndex++;
				restIndex++;
			}else if(rightIndex < right.length){
				res[restIndex]=right[rightIndex];
				rightIndex++;
				restIndex++;
			}
		}
		return res;
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
