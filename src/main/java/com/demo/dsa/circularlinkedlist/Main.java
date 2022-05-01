package com.demo.dsa.circularlinkedlist;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
//		Node head = list.create("10");
//		System.out.println(head.getValue());
//		System.out.println(head.getNext().getValue());
//		
		list.insert("10", 10);
		list.insert("15", 2);
		list.insert("25", 3);
		list.insert("30", 4);
		list.insert("20", 3);
		list.insert("22", 4);
		list.insert("5", 1);
		System.out.println(list.getHead());

//		list.traverse();

//		list.search("200");

		list.delete(1);
		list.delete(2);
		list.delete(3);
		list.delete(4);
		System.out.println(list.getHead());
		System.out.println(list.getHead());

	}

}
