package com.demo.dsa.algorithms.seaching;

public class Ceiling {
	public static void main(String[] args) {

		int[] arr = { -11, -10, 19, -5, -2, 2, 7, 8, 10, 45, 67, 91, 104, 106, 201, 1111 };

//		int[] arr= {5};

		System.out.println(ceiling(arr, 11));

	}

	// smallest number greater than equal to target
	public static int ceiling(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		if (arr[end] < target) {
			return -1;
		}

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

		return start;

	}

}
