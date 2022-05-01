package com.demo.dsa.singularlinkedlist;

public class Main {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		Node head = null;
		head = list.insert("10", 0);
		head = list.insert("15", 1);
		head = list.insert("25", 2);
		head = list.insert("30", 3);
		head = list.insert("20", 2);
		head = list.insert("40", 10);
		
		System.out.println(head.toString());

//		list.traverse();
//		list.search("40");
//		list.search("1000");
		
		list.delete(1);
		head=list.getHead();
		System.out.println(head.toString());



	}

}
