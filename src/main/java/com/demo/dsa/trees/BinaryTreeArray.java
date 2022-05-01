package com.demo.dsa.trees;

public class BinaryTreeArray {

	public String[] arr;
	public int lastUsedIndex;

	public BinaryTreeArray(int size) {
		this.arr = new String[size + 1];
		lastUsedIndex = 0;
		System.out.println("BT using Array is created");
	}

	public boolean isFull() {
		return arr.length - 1 == lastUsedIndex ? true : false;
	}

	// TC: O(1) SC: O(1) 
	public void insert(String value) {

		if (!isFull()) {
			lastUsedIndex++;
			arr[lastUsedIndex] = value;
			System.out.println("the value " + value + " is inserted");

		} else {
			System.out.println("Full cant insert");
		}

	}

	// Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Root - Left - Right
	public void preOrderTraversal(int index) {

		if (index > lastUsedIndex)
			return;
		System.out.println(arr[index]);
		preOrderTraversal(2 * index);
		preOrderTraversal(2 * index + 1);

	}

	// Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Left - Root - Right
	public void inOrderTraversal(int index) {

		if (index > lastUsedIndex)
			return;
		inOrderTraversal(2 * index);
		System.out.println(arr[index]);
		inOrderTraversal(2 * index + 1);
	}

	// Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Left - Right - Root
	public void postOrderTraversal(int index) {

		if (index > lastUsedIndex)
			return;
		postOrderTraversal(2 * index);
		postOrderTraversal(2 * index + 1);
		System.out.println(arr[index]);

	}

	// Breadth First Search
	// TC: O(n) SC: O(1)
	// same level nodes
	public void levelOrderTraversal() {

		for (int i = 1; i <= lastUsedIndex; i++) {
			System.out.println(arr[i]);
		}

	}

	public int search(String value) {

		for (int i = 1; i <= lastUsedIndex; i++) {
			if (arr[i].equals(value)) {
				System.out.println("Found at " + i);
				return i;
			}
		}
		System.out.println("Not found");
		return -1;
	}

	// TC: O(n) SC: O(1) 
	public void delete(String value) {
		int index = search(value);
		if (index == -1) {
			System.out.println("Not found to delete");
			return;
		}
		arr[index] = arr[lastUsedIndex];
		arr[lastUsedIndex] = null;
		lastUsedIndex--;
		System.out.println("Deleted Successfully");

	}

	public void delete() {
		arr = null;
	}

}
