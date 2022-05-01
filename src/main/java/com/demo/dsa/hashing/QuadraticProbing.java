package com.demo.dsa.hashing;

import java.util.ArrayList;

public class QuadraticProbing {

	String[] hashTable;
	int usedCellNumber;

	public QuadraticProbing(int size) {
		hashTable = new String[size];
		usedCellNumber = 0;
	}

	public int modASCIIHashFunction(String word, int M) {
		char[] ch = word.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			sum += ch[i];
		}

		return sum % M;
	}

	private double getLoadFactor() {
		double loadFactor = usedCellNumber * 1.0 / hashTable.length;
		return loadFactor;
	}

	public void rehashKeys(String word) {
		ArrayList<String> data = new ArrayList<>();
		for (String s : hashTable) {
			if (s != null)
				data.add(s);
		}
		data.add(word);
		hashTable = new String[hashTable.length * 2];
		for (String s : data) {
			insert(s);
		}

	}

	public void insert(String word) {

		if (getLoadFactor() >= 0.75)
			rehashKeys(word);
		else {
			int index = modASCIIHashFunction(word, hashTable.length);
			int counter = 0;
			for (int i = index; i < index + hashTable.length; i++) {
				int newIndex = (index + (counter * counter)) % hashTable.length;
				if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
					hashTable[newIndex] = null;
					break;
				}else
					System.out.println("newIndex already occupied, trying next");
			}
			counter++;
		}
		usedCellNumber++;
	}

	public void display() {

		if (hashTable == null)
			System.out.println("hashtable doesnot exists");
		else
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println("Index " + i + " key: " + hashTable[i]);
			}
	}

	public boolean search(String word) {
		int index = modASCIIHashFunction(word, hashTable.length);

		for (int i = index; i < index + hashTable.length; i++) {
			int newIndex = i % hashTable.length;
			if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
				System.out.println(word + " found at location: " + newIndex);
				return true;
			}
		}
		System.out.println(word + " not found");
		return false;

	}

	public void delete(String word) {
		int index = modASCIIHashFunction(word, hashTable.length);

		for (int i = index; i < index + hashTable.length; i++) {
			int newIndex = i % hashTable.length;
			if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
				hashTable[newIndex] = null;
				return;
			}
		}
		System.out.println(word + " not found");

	}
}
