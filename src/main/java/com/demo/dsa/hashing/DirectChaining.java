package com.demo.dsa.hashing;

import java.util.LinkedList;

public class DirectChaining {

	LinkedList<String>[] hashTable;
	int maxChainSize = 5;

	public DirectChaining(int size) {
		hashTable = new LinkedList[size];
	}

	public int modASCIIHashFunction(String word, int M) {
		char[] ch = word.toCharArray();
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			sum += ch[i];
		}

		return sum % M;
	}

	public void insertHashTable(String word) {
		int index = modASCIIHashFunction(word, hashTable.length);

		if (hashTable[index] == null) {
			hashTable[index] = new LinkedList<String>();
			hashTable[index].add(word);
		} else {
			hashTable[index].add(word);
		}
	}

	public void display() {

		if (hashTable == null)
			System.out.println("hashtable doesnot exists");
		else
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println("Index " + i + " key: " + hashTable[i]);
			}
	}

	public boolean searchHashTable(String word) {
		int index = modASCIIHashFunction(word, hashTable.length);
		if (hashTable[index] != null && hashTable[index].contains(word)) {
			System.out.println("word " + word + " found at: " + index);
			return true;
		} else
			return false;
	}

	public void delete(String word) {
		int index = modASCIIHashFunction(word, hashTable.length);
		if (hashTable[index] != null && hashTable[index].contains(word)) {
			System.out.println("word " + word + " found at: " + index);
			hashTable[index].remove(word);
		} else
			System.out.println("word not found: " + word);
	}

}
