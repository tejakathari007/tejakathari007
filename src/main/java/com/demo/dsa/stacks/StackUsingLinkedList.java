package com.demo.dsa.stacks;

import com.demo.dsa.singularlinkedlist.SingleLinkedList;

public class StackUsingLinkedList {

	public SingleLinkedList list;

	public StackUsingLinkedList() {
		this.list = new SingleLinkedList();
	}

	public void push(int value) {
		list.insert(value + "", 1);
	}

	public boolean isEmpty() {
		return list.getHead() == null ? true : false;
	}

	public int pop() {
		int result = -1;
		if (!isEmpty()) {
			result = Integer.parseInt(list.getHead().getValue());
			list.delete(1);

		} else
			System.out.println("Stack is empty");

		return result;
	}

	public int peek() {
		int result = -1;
		if (!isEmpty()) {
			result = Integer.parseInt(list.getHead().getValue());
		} else
			System.out.println("Stack is empty");

		return result;
	}
	
	public void deleteStack() {
		list=null;
		System.out.println("Stack deleted");
	}

}
