package com.demo.dsa.algorithms.seaching;

public class SeachInMountainArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 4, 3, 2 };

//		int[] arr= {5};

		int peak = peakOfArray(arr);
		int target = 3;

		int firstTry = orderAgnosticbinarySearch(arr, target, 0, peak);
		if (firstTry != -1)
			System.out.println(firstTry);
		else
			System.out.println(orderAgnosticbinarySearch(arr, target, peak + 1, arr.length - 1));

	}

	public static int peakOfArray(int[] arr) {

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

	public static int orderAgnosticbinarySearch(int[] arr, int target, int start, int end) {

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