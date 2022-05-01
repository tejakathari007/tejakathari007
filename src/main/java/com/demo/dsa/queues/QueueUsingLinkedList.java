package com.demo.dsa.queues;

import com.demo.dsa.singularlinkedlist.SingleLinkedList;

public class QueueUsingLinkedList {

	SingleLinkedList list;

	public QueueUsingLinkedList() {
		list = new SingleLinkedList();
	}

	public boolean isEmpty() {
		return list.getHead() == null ? true : false;
	}

	public void enQueue(int value) {
		list.insert(value + "", list.getSize());
	}

	public int deQueue() {
		int result = -1;
		if (!isEmpty()) {
			result = Integer.parseInt(list.getHead().getValue());
			list.delete(1);
		}
		return result;
	}

	public int peek() {
		int result = -1;
		if (!isEmpty()) {
			result = Integer.parseInt(list.getHead().getValue());
		}
		return result;
	}

	public void delete() {
		list.setHead(null);
		list.setTail(null);
	}

}
