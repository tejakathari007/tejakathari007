package com.demo.dsa.trees;

public class BinaryNodeInt {

	public int value;
	public int height;
	public BinaryNodeInt left;
	public BinaryNodeInt right;

	public BinaryNodeInt() {

	}

	public BinaryNodeInt(int value) {
		this.value = value;
	}

	public BinaryNodeInt(int value, BinaryNodeInt left, BinaryNodeInt right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

}
