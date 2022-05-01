package com.demo.dsa.algorithms.seaching;

public class BitonicORMountainArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 4, 3, 2 };

//		int[] arr= {5};

		System.out.println(binarySearch(arr));

	}

	public static int binarySearch(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] < arr[mid + 1])
				start = mid + 1;
			else if (arr[mid] > arr[mid + 1])
				end = mid;

		}

		return start;

	}

}