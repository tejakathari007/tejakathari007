package com.demo.dsa.algorithms.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 1, 6, 5, 2 };
		bubbleSort(arr);
		display(arr);
	}

	static void bubbleSort(int[] integers) {
		int n = integers.length;

		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 1; j < n - i; j++) {
				if (integers[j - 1] > integers[j]) {
					swapped = true;
					int temp = integers[j];
					integers[j] = integers[j - 1];
					integers[j - 1] = temp;
				}
			}
			if (!swapped)
				break;
		}
	}

	static void display(int[] integers) {
		for (int i : integers) {
			System.out.println(i);
		}
	}
}
