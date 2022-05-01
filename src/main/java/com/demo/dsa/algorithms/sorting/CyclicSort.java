package com.demo.dsa.algorithms.sorting;

public class CyclicSort {

	public static void main(String[] args) {

		int[] arr = { 8,4, 3, 1, 6, 5, 2,7,9,10 };
		display(arr);
		cyclicSort(arr);
		display(arr);
	}

	static void cyclicSort(int[] integers) {

		int i = 0;
		while (i < integers.length - 1) {
			int correct = integers[i] - 1;
			if (integers[i] != i + 1) {
				swap(integers, i, correct);
			} else {
				i++;
			}

		}
		
		System.out.println();
	}

	static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

	static void display(int[] integers) {
		for (int i : integers) {
			System.out.println(i);
		}
	}
}
