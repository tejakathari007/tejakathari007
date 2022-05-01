package com.demo.dsa.circulardoublylinkedlists;

public class Main {

	public static void main(String[] args) {
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		list.insert(10, 10);
		list.insert(20, 1);
		list.insert(30, 2);
		list.insert(40, 3);
		list.insert(50, 10);
		list.insert(25, 3);
		list.insert(5, 1);
		list.insert(60, 100);
		list.insert(0, 1);

		System.out.println(list.getHead());

//		list.traverse();
//		list.reverseTravserse();

//		list.search(250);

		list.delete(1);
		System.out.println(list.getHead());

		list.delete(8);
		System.out.println(list.getHead());

		list.delete(4);
		System.out.println(list.getHead());

	}

}
