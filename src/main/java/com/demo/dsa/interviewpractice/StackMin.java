package com.demo.dsa.interviewpractice;

public class StackMin {

	int[] arr;
	int topOfStack;
	int min = Integer.MIN_VALUE;

	public StackMin(int size) {
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

	public int min() {
		return min;
	}

	public void push(int value) {

		if (!isFull()) {
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println("value is inserted: " + value);
			if (min > value)
				min = value;
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

}
