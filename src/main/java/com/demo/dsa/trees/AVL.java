package com.demo.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {

	public BinaryNodeInt root;

	public AVL() {
		root = null;
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

	public void delete() {
		root = null;
	}

}
