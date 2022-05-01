package com.demo.dsa.algorithms.seaching;

public class RotatedSortedArray {

	public static void main(String[] args) {

		int[] arr = { 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };

		System.out.println(pivotBS(arr, 8));

	}

	static int pivotBS(int[] arr, int target) {

		int pivot = pivot(arr);

		if (pivot == -1)
			return binarySearch(arr, target, 0, arr.length - 1);

		if (arr[pivot] == target)
			return pivot;

		if (target > arr[0])
			return binarySearch(arr, target, 0, pivot - 1);
		else
			return binarySearch(arr, target, pivot + 1, arr.length - 1);

	}

	public static int pivot(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			// 4cases
			if (mid < end && arr[mid] > arr[mid + 1])
				return mid;
			if (mid > start && arr[mid - 1] > arr[mid])
				return mid - 1;

			if (arr[mid] <= start)
				end = mid - 1;
			else
				start = mid + 1;

		}
		return -1;
	}

	public static int pivotWIthDup(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			// 4cases
			if (mid < end && arr[mid] > arr[mid + 1])
				return mid;
			if (mid > start && arr[mid - 1] > arr[mid])
				return mid - 1;

			if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
				if (arr[start] > arr[start + 1])
					return start;
				else
					start++;

				if (arr[end] > arr[end - 1])
					return end - 1;
				else
					end--;
			} else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
				end = mid - 1;
			else
				start = mid + 1;

		}
		return -1;
	}

	public static int binarySearch(int[] arr, int target, int start, int end) {

		while (start <= end) {

			// int mid= (start+end)/2; start+end may go beyond the Integer max range, so the
			// below is the alternative

			int mid = start + (end - start) / 2;

			if (target < arr[mid])
				end = mid - 1;
			else if (target > arr[mid])
				start = mid + 1;
			else
				return mid;

		}

		return -1;

	}

}
