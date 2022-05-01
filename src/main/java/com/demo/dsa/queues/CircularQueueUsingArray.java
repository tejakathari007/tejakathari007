package com.demo.dsa.queues;

public class CircularQueueUsingArray {

	public int[] arr;
	public int beginOfQueue;
	public int topOfQueue;

	public CircularQueueUsingArray(int length) {
		this.arr = new int[length];
		beginOfQueue = -1;
		topOfQueue = -1;
		System.out.println("Queue is successfully created");
	}

	public boolean isFull() {
		if (topOfQueue + 1 == beginOfQueue)
			return true;
		else if (beginOfQueue == 0 && topOfQueue + 1 == arr.length)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		return topOfQueue == -1 ? true : false;
	}

	public void enqueue(int value) {
		if (!isFull()) {
			if (isEmpty()) {
				beginOfQueue = 0;
				topOfQueue++;
				arr[topOfQueue] = value;
			} else {
				if (topOfQueue == arr.length - 1)
					topOfQueue = 0;
				else
					topOfQueue++;
				arr[topOfQueue] = value;
			}
		} else {
			System.out.println("Queue is full");
		}
	}

	public int dequeue() {
		int result = -1;
		if (!isEmpty()) {
			result = arr[beginOfQueue];
			arr[beginOfQueue] = -1;

			if (beginOfQueue == topOfQueue)
				topOfQueue = beginOfQueue = -1;
			else if (beginOfQueue == arr.length - 1)
				beginOfQueue = 0;
			else
				beginOfQueue++;
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
