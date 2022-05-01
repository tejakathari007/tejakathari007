package com.demo.dsa.doublylinkedlists;

public class Node {

	private int value;
	private Node next;
	private Node prev;

	public Node(int value, Node prev, Node next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {

		String result = "";
		Node temp = this;
		for (int i = 0; i <= 100; i++) {
			result += temp.getValue() + "-->";
			if (temp.next == null)
				break;
			temp = temp.next;
		}
		return result;
	}

}
