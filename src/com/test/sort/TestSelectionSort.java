package com.test.sort;

public class TestSelectionSort {

	/**
	 * We can create a java program to sort array elements using selection sort.
	 * In selection sort algorithm, we search for the lowest element and arrange
	 * it to the proper location. We swap the current element with the next
	 * lowest number.
	 */
	public static int[] arr = { 1, 6, 2, 8, 3, 9, 0, 2, 3 };

	public static void main(String[] args) {
		int[] arr1 = { 9, 14, 3, 2, 43, -11, 58, -22 };
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		int[] arr2 = sortElement(arr1);
		System.out.println();
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		int[] arr3 = sortElement1(arr1);
		System.out.println();
		for (int i : arr3) {
			System.out.print(i + " ");
		}
		System.out.println();
		printArray(arr);
		assendingOrder(arr);
		desendingOrder(arr);
	}

	public static int[] sortElement1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					index = j;
				}
			}
			int n = arr[index];
			arr[index] = arr[i];
			arr[i] = n;

		}
		return arr;
	}

	public static int[] sortElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int tmp = lowestNum(i, arr);
			for (int j = i; j < arr.length; j++) {
				if (tmp == arr[j]) {
					int n = arr[j];
					arr[j] = arr[i];
					arr[i] = n;
				}
			}

		}
		return arr;
	}

	public static int lowestNum(int start, int[] arr) {
		int num = arr[start];
		for (int i = start + 1; i < arr.length; i++) {
			if (num > arr[i]) {
				num = arr[i];
			}
		}
		return num;
	}

	public static void assendingOrder(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int lowestIndex = lowestElementIndex(arr, i + 1);
			int tmp = arr[i]; // 1
			arr[i] = arr[lowestIndex]; //
			arr[lowestIndex] = tmp;
		}
		System.out.println();
		printArray(arr);
	}

	public static void desendingOrder(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int lowestIndex = highestElementIndex(arr, i + 1);
			int tmp = arr[i]; // 1
			arr[i] = arr[lowestIndex]; //
			arr[lowestIndex] = tmp;
		}
		System.out.println();
		printArray(arr);
	}

	public static int lowestElementIndex(int[] arr, int startIndex) {
		int lowest = arr[startIndex - 1];
		int lowestIndex = startIndex - 1;
		for (int i = startIndex; i < arr.length; i++) {
			if (arr[i] < lowest) {
				lowestIndex = i;
				lowest = arr[i];
			}
		}
		return lowestIndex;
	}

	public static int highestElementIndex(int[] arr, int startIndex) {
		int highest = arr[startIndex - 1];
		int highestIndex = startIndex - 1;
		for (int i = startIndex; i < arr.length; i++) {
			if (arr[i] > highest) {
				highestIndex = i;
				highest = arr[i];
			}
		}
		return highestIndex;
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
