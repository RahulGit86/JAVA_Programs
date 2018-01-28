package com.test.sort;

public class TestBubbleSort {

	/**
	 * We can create a java program to sort array elements using bubble sort.
	 * Bubble sort algorithm is known as the simplest sorting algorithm. In
	 * bubble sort algorithm, array is traversed from first element to last
	 * element. Here, current element is compared with the next element. If
	 * current element is greater than the next element, it is swapped.
	 */
	public static int[] arr = { 1, 6, -1, 8, -3, 9, 0, 2, -2, 3 };

	public static void main(String[] args) {

		int[] arr1 = { 19, 1, 4, 2, 6, 2, 8, 3 };
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		bubbleSort(arr1);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		printArray(arr);
		System.out.println("\nAsending array");
		asendingSort(arr);
		System.out.println("\nDesending array");
		desendingSort(arr);

	}

	public static void bubbleSort(int[] arr) {
		int tmp = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 1; j < (len - i); j++) {
				if (arr[j - 1] > arr[j]) {
					tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}

			}
		}
	}

	public static void asendingSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j + 1] < arr[j]) {
					int k = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = k;
				}
			}
		}
		printArray(arr);
	}

	public static void desendingSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr.length - 1 - i; j > 0; j--) {
				if (arr[j - 1] < arr[j]) {
					int k = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = k;
				}
			}
		}
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
