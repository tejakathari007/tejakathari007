package com.demo.dsa.queues;

public class QueueUsingArray {

	public int[] arr;
	public int beginOfQueue;
	public int topOfQueue;

	public QueueUsingArray(int length) {
		this.arr = new int[length];
		beginOfQueue = -1;
		topOfQueue = -1;
		System.out.println("Queue is successfully created");
	}

	public boolean isFull() {
		return arr.length - 1 == topOfQueue ? true : false;
	}

	public boolean isEmpty() {
		return beginOfQueue == -1 ? true : false;
	}

	public void enqueue(int value) {
		if (!isFull()) {
			if (isEmpty())
				beginOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
		} else {
			System.out.println("Queue is full");
		}
	}

	public int dequeue() {
		int result = -1;
		if (!isEmpty()) {
			result = arr[beginOfQueue];
			arr[beginOfQueue] = -1;
			beginOfQueue++;
			if (beginOfQueue > topOfQueue)
				topOfQueue = beginOfQueue = -1;
		} else {
			System.out.println("Queue is empty");
		}
		return result;
	}

	public int peek() {
		int result = -1;
		if (!isEmpty()) {
			result = arr[beginOfQueue];
		} else {
			System.out.println("Queue is empty");
		}
		return result;
	}

	public void deleteQueue() {
		arr = null;
	}
}
