package com.demo.dsa.algorithms.seaching;

public class CeilingCharacters {
	public static void main(String[] args) {

		char[] arr = { 'c', 'd', 'e', 'f', 'g' };

		System.out.println(ceiling(arr, 'e'));

	}

	// smallest char greater than target
	public static int ceiling(char[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		if (arr[end] <= target) {
			return start;
		}

		while (start <= end) {

			// int mid= (start+end)/2; start+end may go beyond the Integer max range, so the
			// below is the alternative

			int mid = start + (end - start) / 2;

			if (target < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;

		}

//		return start%(arr.length); or 

		return start;

	}

}
