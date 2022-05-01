package com.demo.dsa.algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

	int arr[];

	public BucketSort(int[] arr) {
		this.arr = arr;
	}

	void display(int[] integers) {
		for (int i : integers) {
			System.out.println(i);
		}
	}

	void buckets(ArrayList<Integer>[] buckets) {

		for (int i = 0; i < buckets.length; i++) {
			System.out.println("bucket number: " + i);
			for (Integer j : buckets[i]) {
				System.out.println("-->" + j);
			}
		}
	}

	void bucketSort() {
		int numberOfBucket = (int) Math.ceil(Math.sqrt(arr.length));
		int maxValue = Integer.MIN_VALUE;

		for (int value : arr) {
			if (value > maxValue)
				maxValue = value;
		}
		ArrayList<Integer>[] buckets = new ArrayList[numberOfBucket];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}

		for (int value : arr) {
			int bucketNumber = (int) Math.ceil((float) value * numberOfBucket / (float) maxValue);
			buckets[bucketNumber - 1].add(value);
		}
		System.out.println("before sorting");
		buckets(buckets);

		for (ArrayList<Integer> buck : buckets) {
			Collections.sort(buck);
		}
		System.out.println("after sorting");
		buckets(buckets);

		int index = 0;
		for (ArrayList<Integer> buck : buckets) {
			for (int value : buck) {
				arr[index] = value;
				index++;
			}
		}

	}
}
