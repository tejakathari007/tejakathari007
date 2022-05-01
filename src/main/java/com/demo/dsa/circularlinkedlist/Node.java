package com.demo.dsa.circularlinkedlist;

public class Node {

	private String value;
	private Node next;

	public Node(String value, Node node) {
		this.value = value;
		this.next = node;
	}

	public Node() {

	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {

		String result = "";
		Node temp = this;
		for (int i = 0; i <= 100; i++) {
			result += temp.getValue() + "-->";
			if (temp.next == this)
				break;
			temp = temp.next;
		}
		return result;
	}

}
