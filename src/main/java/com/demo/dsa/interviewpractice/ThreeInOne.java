package com.demo.dsa.interviewpractice;

public class ThreeInOne {
	private int numberOfStacks = 3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;

	public ThreeInOne(int stackSize) {
		stackCapacity = stackSize;
		values = new int[stackSize * numberOfStacks];
		sizes = new int[numberOfStacks];
	}

	public boolean isFull(int stackNum) {
		if (sizes[stackNum] == stackCapacity) {
			return true;
		} else
			return false;
	}

	public boolean isEmpty(int stackNum) {
		if (sizes[stackNum] == 0) {
			return true;
		} else
			return false;
	}

	// indexOfTop - this is helper method for push, pop and peek methods

	private int indexOfTop(int stackNum) {
		int offset = stackNum * stackCapacity;
		return offset + sizes[stackNum] - 1;
	}

	
	public void push(int stackNum, int value) {

		if (!isFull(stackNum)) {
			int index = indexOfTop(stackNum);
			values[index] = value;
			sizes[stackNum]++;
		} else {
			System.out.println("Full");
		}
	}

	public int pop(int stackNum) {
		int value = -1;
		if (!isEmpty(stackNum)) {
			int index = indexOfTop(stackNum);
			value = values[index];
			values[index]=0;
			sizes[stackNum]--;
		} else {
			System.out.println("Empty");
		}
		return value;

	}

	// peek

	public int peek(int stackNum) {
		int value = -1;
		if (!isEmpty(stackNum)) {
			int index = indexOfTop(stackNum);
			value = values[index];
		} else {
			System.out.println("Empty");
		}
		return value;
	}

}
