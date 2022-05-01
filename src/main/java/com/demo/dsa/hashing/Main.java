package com.demo.dsa.hashing;

public class Main {

	public static void main(String[] args) {
//		DirectChaining d = new DirectChaining(15);
//		d.insertHashTable("sword");
//		d.insertHashTable("sword");
//		d.insertHashTable("test");
//		d.delete("sword");
//		d.display();

		LinearProbing linear = new LinearProbing(10);
		linear.insert("sword");
		linear.insert("test");
		linear.insert("red");
		linear.insert("sword");

		linear.search("sword");
		linear.delete("sword");
		linear.display();

	}
}
