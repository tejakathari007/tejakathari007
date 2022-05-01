package com.demo.dsa.trees;

public class BinaryNode {

	public String value;
	public int height;
	public BinaryNode left;
	public BinaryNode right;

	public BinaryNode() {

	}

	public BinaryNode(String value) {
		this.value = value;
	}

	public BinaryNode(String value, BinaryNode left, BinaryNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

}
