package com.demo.dsa.algorithms.seaching;

public class PerfectSquare {

	public static void main(String[] args) {

		System.out.println(isPerfectSquare(2147483647));
	}

	public static boolean isPerfectSquare(int num) {

		if (num == 0 || num == 1)
			return true;

		long start = 0;
		long end = num;

		while (start <= end) {

			long mid = start + (end - start) / 2;

			if (mid*mid > num) {
				end = mid - 1;
			} else if (mid*mid < num) {
				start = mid + 1;
			} else
				return true;
		}

		return false;

	}

}
