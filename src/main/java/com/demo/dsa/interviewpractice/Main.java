package com.demo.dsa.interviewpractice;

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.create(0);
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insert(5);
		list.insert(25);
		list.insert(15);
		list.insert(35);

		list.transverse();

//		InterviewPrep prep = new InterviewPrep();
//		prep.delDups(list);
//		Node n = prep.nthToTheLast(list, 6);
//		System.out.println(n.getValue());

//		list.transverse();
	}

}
