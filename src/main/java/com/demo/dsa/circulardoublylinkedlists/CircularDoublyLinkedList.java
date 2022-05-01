package com.demo.dsa.circulardoublylinkedlists;

public class CircularDoublyLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public Node create(int value) {

		Node temp = new Node();
		temp.setValue(value);
		temp.setNext(temp);
		temp.setPrev(temp);
		tail = head = temp;
		size = 1;
		return head;

	}

	public void insert(int value, int location) {

		if (head == null) {
			create(value);
			return;
		} else if (location >= size) {
			Node newNode = new Node(value, tail, head);
			tail.setNext(newNode);
			head.setPrev(newNode);
			tail = newNode;
			size++;
			return;
		} else {
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				if (i == location) {
					Node newNode = new Node(value, temp.getPrev(), temp);
					temp.getPrev().setNext(newNode);
					temp.setPrev(newNode);
					if (location == 1)
						head = newNode;
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
				if (i == size)
					break;
				temp = temp.getNext();
			}
		}

	}

	public void reverseTravserse() {
		if (tail != null) {
			Node temp = tail;
			for (int i = size; i >= 1; i--) {
				System.out.println(temp.getValue());
				if (i == 1)
					break;
				temp = temp.getPrev();
			}
		}

	}

	public boolean search(int value) {
		if (head != null) {
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				if (value == temp.getValue()) {
					System.out.println("Found at : " + i);
					return true;
				}
				if (i == size)
					break;
				temp = temp.getNext();
			}
		}
		System.out.println("Not found");
		return false;

	}

	public void delete(int location) {
		if (head != null) {
			if (location == 1) {
				if (size == 1) {
					head = tail = null;
					size--;
					return;
				} else {
					tail.setNext(head.getNext());
					head.getNext().setPrev(tail);
					head = head.getNext();
					size--;
					return;
				}
			} else if (location >= size) {
				Node temp=tail;
				head.setPrev(temp.getPrev());
				temp.getPrev().setNext(head);
				tail = temp.getPrev();
				size--;
				return;
			} else {
				Node temp = head;
				for (int i = 1; i <= size; i++) {
					if (i == location) {
						temp.getPrev().setNext(temp.getNext());
						temp.getNext().setPrev(temp.getPrev());
						temp.setPrev(null);
						temp.setNext(null);
						return;
					}
					if (i == size)
						break;
					temp = temp.getNext();
				}
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
