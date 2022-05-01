package com.demo.dsa.singularlinkedlist;

public class SingleLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public Node insertFirstElement(String value) {
		Node node = new Node(value, null);
		head = node;
		tail = node;
		size++;
		return head;
	}

	public Node insert(String value, int location) {
		if (this.head == null)
			return insertFirstElement(value);
		else if (location == 1) {
			Node node = new Node(value, head);
			head = node;
		} else if (location >= size) {
			Node node = new Node(value, null);
			tail.setNext(node);
			tail = node;
			size++;
		} else if (location > 1 && size < location) {
			Node temp = head;
			for (int i = 1; i < size; i++) {
				if (i == location)
					break;
				temp = temp.getNext();
			}
			Node node = new Node(value, temp.getNext());
			temp.setNext(node);
			if (location == 1)
				temp = head;
			size++;

		}

		return head;
	}

	public void traverse() {
		Node temp = head;
		if (temp == null)
			return;
		for (int i = 1; i <= size; i++) {
			System.out.println(temp.getValue());
			temp = head.getNext();
		}
	}

	public boolean search(String value) {
		Node temp = head;
		if (temp == null)
			return false;
		for (int i = 1; i <= size; i++) {
			if (temp.getValue().equals(value)) {
				System.out.println("Found the value " + value + " at: " + i);
				return true;
			}
			temp = temp.getNext();
		}
		System.out.println("the value " + value + " Not found ");
		return false;
	}

	public void delete(int location) {
		if (head == null)
			System.out.println("empty linkedlist");
		else {
			if (location == 1 || (location > size && size == 1)) {
				head = head.getNext();
				size--;
				tail = size == 0 ? null : tail;
				return;
			}
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				if (location - 1 == i) {
					temp.setNext(temp.getNext().getNext());
					size--;
					if (location == size)
						tail = temp;
					return;
				}
				temp = temp.getNext();
			}
		}

	}

	public void deleteWhole() {
		if (head != null) {
			head.setNext(null);
		}
		if (tail != null) {
			tail.setNext(null);
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
