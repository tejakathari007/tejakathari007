package com.demo.dsa;

public class SingleDimensionArray {

	int[] numericArray = null;

	public SingleDimensionArray(int index) {
		numericArray = new int[index];
		for (int value : numericArray) {
			numericArray[value] = Integer.MIN_VALUE;
		}

	}

}
