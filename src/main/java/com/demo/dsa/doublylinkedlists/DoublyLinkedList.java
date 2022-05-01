package com.demo.dsa.doublylinkedlists;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public Node create(int value) {

		head = new Node(value, null, null);
		tail = head;
		size = 1;
		return head;

	}

	public void insert(int value, int location) {

		if (head == null) {
			create(value);
			return;
		} else if (location >= size) {
			Node temp = tail;
			Node newNode = new Node(value, temp, null);
			temp.setNext(newNode);
			tail = newNode;
			size++;
			return;
		} else {
			Node temp = head;
			if (location == 1) {
				Node newNode = new Node(value, null, temp);
				temp.getNext().setPrev(newNode);
				head = newNode;
				return;
			}
			for (int i = 1; i <= size; i++) {
				if (location == i) {
					Node newNode = new Node(value, temp.getPrev(), temp);
					temp.getPrev().setNext(newNode);
					temp.setPrev(newNode);
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
				if (head.getNext() == null)
					break;
				temp = temp.getNext();
			}
		}

	}

	public void reverseTraverse() {

		if (tail != null) {
			Node temp = tail;
			for (int i = size; i >= 1; i--) {
				System.out.println(temp.getValue());
				if (temp.getPrev() == null)
					break;
				temp = temp.getPrev();
			}
		}

	}

	public boolean search(int value) {

		if (head != null) {
			Node temp = head;
			for (int i = 1; i <= size; i++) {
				if (temp.getValue() == value) {
					System.out.println("found at " + i);
					return true;
				}
				if (temp.getNext() == null)
					break;
				temp = temp.getNext();
			}
		}
		System.out.println("not found ");

		return false;

	}

	public void delete(int location) {

		if (head != null) {
			if (location == 1 && size == 1)
				head = tail = null;
			else if (location >= size) {
				Node temp = tail;
				temp.getPrev().setNext(null);
				temp.setPrev(null);
				tail = temp.getPrev();
				size--;
			} else {
				Node temp = head;
				if (location == 1) {
					temp = temp.getNext();
					temp.setPrev(null);
					head = temp;
					return;
				}
				for (int i = 1; i <= size; i++) {
					if (location == i) {
						temp.getPrev().setNext(temp.getNext());
						temp.getNext().setPrev(temp.getPrev());
						size--;
						return;
					}
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
