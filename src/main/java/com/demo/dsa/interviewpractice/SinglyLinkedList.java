package com.demo.dsa.interviewpractice;

public class SinglyLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public void create(int nodeValue) {
		Node newNode = new Node();
		newNode.setValue(nodeValue);
		newNode.setNext(null);
		head = tail = newNode;
		size = 1;
	}

	public void insert(int value) {
		Node newNode = new Node();
		newNode.setValue(value);
		newNode.setNext(null);
		tail.setNext(newNode);
		tail = newNode;
		size++;

	}

	public void transverse() {
		Node temp = head;
		for (int i = 1; i <= size; i++) {
			System.out.print(temp.getValue());

			if (i != size) {
				System.out.print(" -> ");
			}

			temp = temp.getNext();
		}
		System.out.println("\n");
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
