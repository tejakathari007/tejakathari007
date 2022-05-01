package com.demo.dsa.algorithms.seaching;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {

//	int[] arr = { -11, -10, 19, -5, -2, 2, 7, 8, 10, 45, 67, 91, 104, 106, 201, 1111 };

		int[] arr = { 5, 4, 3, 2, 1, -10, -11, 121, -141 };

		System.out.println(binarySearch(arr, -11));

	}

	public static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		boolean isAsc = arr[start] > arr[end] ? false : true;

		while (start <= end) {

			// int mid= (start+end)/2; start+end may go beyond the Integer max range, so the
			// below is the alternative

			int mid = start + (end - start) / 2;

			if (target == arr[mid])
				return mid;

			if (target < arr[mid]) {
				end = isAsc ? (mid - 1) : end;
				start = isAsc ? start : (mid + 1);
			} else {
				start = isAsc ? (mid + 1) : start;
				end = isAsc ? end : (mid - 1);
			}

		}
		return -1;
	}

}
