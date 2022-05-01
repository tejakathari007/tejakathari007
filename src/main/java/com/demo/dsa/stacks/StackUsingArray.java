package com.demo.dsa.stacks;

public class StackUsingArray {

	int[] arr;
	int topOfStack;

	public StackUsingArray(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("The stack is created with size: " + size);
	}

	public boolean isEmpty() {
		return topOfStack == -1 ? true : false;
	}

	public boolean isFull() {
		return topOfStack == arr.length - 1 ? true : false;
	}

	public void push(int value) {

		if (!isFull()) {
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println("value is inserted: " + value);
		} else {
			System.out.println("Stack is full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			topOfStack--;
			return arr[topOfStack];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}

	}

	public int peek() {
		if (!isEmpty()) {
			return arr[topOfStack];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}

	}

	public void deleteStack() {
		arr = null;
		System.out.println("stack deleted sucessfully");

	}
}
