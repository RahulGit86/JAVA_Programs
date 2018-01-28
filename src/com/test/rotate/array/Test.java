package com.test.rotate.array;

public class Test {

	public static void main(String[] args) {

		//int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] arr = { 1, 2,3,4,5 };
		//reverse(arr);
		// rotate(arr,1);
		// System.out.println("\nSecond method");
		// rotate1(arr,1);
		// reverse(arr);
	}

	public static void rotate(int[] a, int n) {
		System.out.println("before rotate:");
		for (int i : a) {
			System.out.print(i + " ");
		}
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (n > a.length)
				n = n % a.length;
			if (n + i < a.length)
				b[n + i] = a[i];
			else
				b[n + i - a.length] = a[i];
		}
		System.out.println("\nAfter rotate:");
		for (int i : b) {
			System.out.print(i + " ");
		}
	}

	public static void rotate1(int[] nums, int k) {
		if (k > nums.length)
			k = k % nums.length;

		int[] result = new int[nums.length];

		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}

		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}

		for (int i : result) {
			System.out.print(i + " ");
		}
		System.arraycopy(result, 0, nums, 0, nums.length);
	}

	

}
