package com.test.rotate;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		reverse(arr);
		rotateStr("test rahul singh");
	}

	public static void reverse(int[] a) {
		System.out.println("Before::");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length / 2; i++) {
			int b = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = b;
		}
		System.out.println("\nAfter::");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static void rotateStr(String str) {
		System.out.println("\nBefore::" + str);
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length / 2; i++) {
			char c = charArr[charArr.length - i - 1];
			charArr[charArr.length - i - 1] = charArr[i];
			charArr[i] = c;
		}
		String str1 = String.valueOf(charArr);
		System.out.println("After::" + str1);
	}

}
