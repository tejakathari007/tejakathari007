package com.demo.dsa.algorithms.seaching;

public class InfiniteArraySearch {
	public static void main(String[] args) {

		int[] arr = { -11, -10, 19, -5, -2, 2, 7, 8, 10, 45, 67, 91, 104, 106, 201, 1111, 1121, 1122, 11166, 1177, 1188,
				1190, 1211, 1212, 1213, 1215, 1216, 1217, 1218, 1219, 1220, 1221, 1222, 1223, 1224, 1225, 1226, 1227,
				1228, 1229, 1230 };

//		int[] arr= {5};

		System.out.println(infiniteSearch(arr, 201));

	}

	public static int infiniteSearch(int[] arr, int target) {

		int start = 0;
		int end = 1;

		while (target > arr[end]) {

			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;

		}

		return binarySearch(arr, target, start, end);

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
