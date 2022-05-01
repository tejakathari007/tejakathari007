package com.demo.dsa.interviewpractice;

import java.util.HashSet;

public class InterviewPrep {

	public void delDups(SinglyLinkedList list) {
		HashSet<Integer> set = new HashSet<>();
		Node current = list.getHead();
		Node prev = null;

		while (current != null) {
			if (set.contains(current.getValue())) {
				prev.setNext(current.getNext());
				list.setSize(list.getSize() - 1);
			} else {
				prev = current;
				set.add(current.getValue());
			}
			current = current.getNext();
		}
	}

	public Node nthToTheLast(SinglyLinkedList list, int n) {

		int index = list.getSize() - n;

		Node temp = list.getHead();
		for (int i = 0; i <= list.getSize(); i++) {
			if (i == index)
				return temp;
			if (temp.getNext() == null)
				break;
			temp = temp.getNext();
		}

		return null;
	}

}
