package com.demo.dsa.doublylinkedlists;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insert(10,10);
		list.insert(20,1);
		list.insert(30,2);
		list.insert(40,3);
		list.insert(50,10);
		list.insert(25,3);
		list.insert(5,1);
		System.out.println(list.getHead().toString());

//		list.traverse();
//		list.reverseTraverse();
		
//		list.search(402);
		
		list.delete(1);
		list.delete(6);
		list.delete(3);
		System.out.println(list.getHead().toString());










	}

}
