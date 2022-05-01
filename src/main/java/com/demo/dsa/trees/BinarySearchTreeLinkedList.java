package com.demo.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeLinkedList {

	public BinaryNodeInt root;

	public BinarySearchTreeLinkedList() {
		root = null;
	}

	// TC: O(logn) SC: O(logn)
	private BinaryNodeInt insert(BinaryNodeInt current, int value) {
		if (current == null) {
			BinaryNodeInt newNode = new BinaryNodeInt(value);
//			System.out.println("Success");
			return newNode;
		} else if (value <= current.value) {
			current.left = insert(current.left, value);
			return current;
		} else {
			current.right = insert(current.right, value);
			return current;
		}

	}

	public void insert(int value) {
		root = insert(root, value);
	}

	// Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Root - Left - Right
	public void preOrderTraversal(BinaryNodeInt node) {

		if (node != null) {
			System.out.println(node.value);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}

	}

	// Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Left - Root - Right
	public void inOrderTraversal(BinaryNodeInt node) {

		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.value);
			inOrderTraversal(node.right);
		}

	}

	// Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Left - Root - Right
	public void postOrderTraversal(BinaryNodeInt node) {

		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.value);
		}

	}

	// Breadth First Search
	// TC: O(n) SC: O(n)
	// same level nodes
	// preferered as queue performs better than stack(recursion)
	public void levelOrderTravsersal(BinaryNodeInt node) {

		if (node != null) {

			Queue<BinaryNodeInt> queue = new LinkedList<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNodeInt current = queue.remove();
				System.out.println(current.value);
				if (current.left != null)
					queue.add(current.left);
				if (current.right != null)
					queue.add(current.right);
			}

		}
	}

	// TC: O(logn) SC: O(logn)
	public BinaryNodeInt search(BinaryNodeInt node, int value) {

		if (node != null)
			if (node.value == value) {
				System.out.println("Found");
				return node;
			} else if (node.value > value)
				return search(node.left, value);
			else if (node.value < value)
				return search(node.right, value);

		return null;

	}

	private BinaryNodeInt minimumNode(BinaryNodeInt node) {
		if (node.left == null)
			return node;
		else
			return minimumNode(node.left);

	}

	// TC: O(logn) SC: O(logn)
	public BinaryNodeInt delete(BinaryNodeInt node, int value) {

		if (node != null) {

			if (value < node.value)
				node.left = delete(node.left, value);
			else if (value > node.value)
				node.right = delete(node.right, value);
			else {
				if (node.left != null && node.right != null) {
					BinaryNodeInt minRight = minimumNode(node.right);
					node.value = minRight.value;
					node.right = delete(node.right, minRight.value);
				} else if (node.left != null) {
					node = node.left;
				} else if (root.right != null) {
					node = node.right;
				} else {
					node = null;
				}
			}
		} else {
			System.out.println("Not found");
			return null;
		}

		return node;
	}
	
	public void delete() {
		root=null;
	}

}
