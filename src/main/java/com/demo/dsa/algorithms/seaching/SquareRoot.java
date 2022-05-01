package com.demo.dsa.algorithms.seaching;

public class SquareRoot {

	public static void main(String[] args) {

		System.out.println(mySqrt(8));
	}

	public static int mySqrt(int x) {

		int start = 0;
		int end = x;

		if (x == 0 || x == 1)
			return x;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (mid > x / mid) {
				end = mid - 1;
			} else if (mid < x / mid) {
				start = mid + 1;
			} else
				return mid;

		}
		return start;

	}

}
