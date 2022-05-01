package com.demo.dsa.stacks;

public class Main {

	public static void main(String[] args) {
//		StackUsingArray stack = new StackUsingArray(5);
//		System.out.println(stack.isFull());
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
//		stack.push(3);
//	
//		
//		stack.pop();
//		stack.peek();
//		
//		stack.deleteStack();
		
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		stack.deleteStack();



	}

}
