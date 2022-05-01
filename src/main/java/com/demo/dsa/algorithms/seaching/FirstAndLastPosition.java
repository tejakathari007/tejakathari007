package com.demo.dsa.algorithms.seaching;

import java.util.Arrays;

public class FirstAndLastPosition {
	public static void main(String[] args) {

		int[] arr = { 5, 6, 7, 8, 8, 8, 8, 8, 10, 12, 14, 16, 18, 20 };

		System.out.println(Arrays.toString(firstAndLast(arr, 80)));

	}

	static int[] firstAndLast(int[] arr, int target) {

		int[] ans = { -1, -1 };

		ans[0] = binarySearch(arr, target, true);
		if (ans[0] != -1)
			ans[1] = binarySearch(arr, target, false);

		return ans;
	}

	public static int binarySearch(int[] arr, int target, boolean isFindingStartIndex) {

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;

		while (start <= end) {

			// int mid= (start+end)/2; start+end may go beyond the Integer max range, so the
			// below is the alternative

			int mid = start + (end - start) / 2;

			if (target < arr[mid])
				end = mid - 1;
			else if (target > arr[mid])
				start = mid + 1;
			else {
				// potential ans
				ans = mid;
				if (isFindingStartIndex)
					end = mid - 1;
				else
					start = mid + 1;
			}

		}

		return ans;

	}

}
