package com.demo.dsa.circularlinkedlist;

public class CircularLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public Node create(String value) {
		Node temp = new Node();
		temp.setNext(head);
		temp.setValue(value);
		size = 1;
		tail = head = temp;
		return head;
	}

	public void insert(String value, int location) {

		if (head == null) {
			create(value);
			return;
		} else if (location >= size) {
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				if (i == size) {
					Node newNode = new Node(value, head);
					temp.setNext(newNode);
					size++;
					tail = newNode;
					return;
				}
				temp = temp.getNext();
			}
		} else {
			if (location == 1) {
				Node newNode = new Node(value, head);
				head = newNode;
				tail.setNext(newNode);
				size++;
				return;
			}
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				if (i == location - 1) {
					Node newNode = new Node(value, temp.getNext());
					temp.setNext(newNode);
					size++;
					return;
				}
				temp = temp.getNext();
			}
		}

	}

	public void traverse() {
		if (head != null) {
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				System.out.println(temp.getValue());
				if (temp.getNext() == head)
					break;
				temp = temp.getNext();

			}
		}
	}

	public boolean search(String value) {
		if (head != null) {
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				if (temp.getValue() == value) {
					System.out.println("found at " + i);
					return true;
				}
				if (temp.getNext() == head)
					break;
				temp = temp.getNext();
			}
		}
		System.out.println("not found");
		return false;
	}

	public void delete(int location) {

		if (head != null) {
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				if (location == 1) {
					head = temp.getNext();
					tail.setNext(head);
					size--;
					return;
				} else if (location - 1 == i) {
					temp.setNext(temp.getNext().getNext());
					if (location == size)
						tail = temp;
					size--;
					return;
				}
				temp = temp.getNext();
			}

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
