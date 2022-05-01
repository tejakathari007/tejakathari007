package com.demo.dsa.algorithms.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 5, 6, 1, 3, 2, 4 };
		insertionSort(arr);
		display(arr);

	}

	static void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else
					break;
			}
		}
	}

	static void display(int[] integers) {
		for (int i : integers) {
			System.out.println(i);
		}
	}
}
