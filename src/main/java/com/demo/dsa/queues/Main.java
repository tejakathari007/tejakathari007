package com.demo.dsa.queues;

public class Main {

	public static void main(String[] args) {

		QueueUsingArray queue = new QueueUsingArray(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.peek());

		System.out.println(queue);

	}

}
