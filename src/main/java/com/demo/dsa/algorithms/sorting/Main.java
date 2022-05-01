package com.demo.dsa.algorithms.sorting;

public class Main {

	public static void main(String[] args) {
//		BubbleSort bs=new BubbleSort();
//		int[] arr= {10,5,16,21,56,72,9};
//		bs.bubbleSort(arr);
//		bs.display(arr);

//		SelectionSort bs=new SelectionSort();
//		int[] arr= {10,5,16,21,56,72,9};
//		bs.selectionSort(arr);
//		bs.display(arr);

//		InsertionSort bs=new InsertionSort();
//		int[] arr= {10,5,16,21,56,72,9};
//		bs.insertionSort(arr);
//		bs.display(arr);

		int[] arr = { 10, 5, 1, 21, 56, 72, 9, 34 };
		BucketSort bs = new BucketSort(arr);
		bs.bucketSort();
		bs.display(arr);
	}

}
