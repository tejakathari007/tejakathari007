package com.demo.dsa.algorithms.seaching;

public class LinearSearch {
	public static void main(String[] args) {

		int[] arr = { 12, 346, 777, 893, 46729, 3098, 20202, 11, 14 };

		int result = 0;
		for (int each : arr) {
			int count = 0;
			while (each > 0) {
				each = each / 10;
				count++;
			}

			if (count % 2 == 0)
				result++;
		}

		System.out.println(result);
		
		int check=(int) (Math.log10(123449)+1);
		System.out.println(check);
		
	}
	
	
	//shortcut to find the number of digits in a number
	// (int) Math.log10(num)+1

}
