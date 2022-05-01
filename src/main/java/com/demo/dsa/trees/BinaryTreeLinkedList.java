package com.demo.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {

	BinaryNode root = null;

	//Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Root - Left - Right
	public void preOrderTraversal(BinaryNode node) {
		if (node == null)
			return;
		System.out.println(node.value);
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);

	}

	//Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Left - Root - Right
	public void inOrderTraversal(BinaryNode node) {

		if (node == null)
			return;
		inOrderTraversal(node.left);
		System.out.println(node.value);
		inOrderTraversal(node.right);
	}

	//Depth First Search
	// TC: O(n) SC: O(n) for recursion
	// Left - Right - Root
	public void postOrderTraversal(BinaryNode node) {

		if (node == null)
			return;
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.value);
	}

	//Breadth First Search
	// TC: O(n) SC: O(n)
	// same level nodes
	// preferered as queue performs better than stack(recursion)
	public void levelOrderTraversal() {

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			System.out.println(node.value);
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);

		}

	}

	// TC: O(n) SC: O(n)
	// preferered level order traversal as queue performs better than
	// stack(recursion)
	public void search(String value) {

		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryNode node = queue.remove();
			if (node.value == value) {
				System.out.println("Found");
				return;
			}
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}

		System.out.println("Not found");

	}

	// TC: O(n) SC: O(n)
	// preferered level order traversal as queue performs better than
	// stack(recursion)
	public void insert(String value) {

		BinaryNode newNode = new BinaryNode(value);

		if (root == null) {
			root = newNode;
			System.out.println("Added at root");
			return;
		} else {
			Queue<BinaryNode> queue = new LinkedList<>();
			queue.add(root);
			while (!queue.isEmpty()) {
				BinaryNode node = queue.remove();
				if (node.left == null) {
					node.left = newNode;
					System.out.println("Added at left");
					return;
				} else if (node.right == null) {
					node.right = newNode;
					System.out.println("Added at right");
					return;
				} else {
					queue.add(node.left);
					queue.add(node.right);
				}

			}
		}
	}

	public BinaryNode deleteDepestNode() {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		BinaryNode prev = null;
		BinaryNode current = null;

		BinaryNode deletedNode = null;

		while (!queue.isEmpty()) {
			prev = current;
			current = queue.remove();
			if (current.left == null) {
				deletedNode = prev.right;
				prev.right = null;
				return deletedNode;
			} else if (current.right == null) {
				deletedNode = current.left;
				current.left = null;
				return deletedNode;
			} else {
				queue.add(current.left);
				queue.add(current.right);
			}

		}
		return deletedNode;
	}

	// replace the node with depest node value and delete the deepest node
	// TC: O(n) SC: O(n)
	public void deleteNode(String value) {
		Queue<BinaryNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode current = queue.remove();
			if (current.value == value) {
				current.value = deleteDepestNode().value;
				System.out.println("node is deleted");
				return;
			} else {
				if (current.left != null)
					queue.add(current.left);
				if (current.right != null)
					queue.add(current.right);
			}

		}
		System.out.println("node doesnt exists");

	}

	public void delete() {
		root = null;
	}

}
