package com.demo.dsa.trees;

public class Main {

	public static void main(String[] args) {

//		TreeNode drinks = new TreeNode("Drinks");
//		TreeNode hot = new TreeNode("hold");
//		TreeNode tea = new TreeNode("tea");
//		TreeNode coffee = new TreeNode("coffee");
//		TreeNode cold = new TreeNode("cold");
//		TreeNode lemonade = new TreeNode("lemonade");
//		TreeNode beer = new TreeNode("beer");
//		cold.addChild(beer);
//		cold.addChild(lemonade);
//		hot.addChild(coffee);
//		hot.addChild(tea);
//		drinks.addChild(cold);
//		drinks.addChild(hot);
//
//		System.out.println(drinks.print(0));

//		BinaryTreeLinkedList binaryTree = new BinaryTreeLinkedList();

//		BinaryNode N6 = new BinaryNode("N6");
//		BinaryNode N7 = new BinaryNode("N7");
//		BinaryNode N8 = new BinaryNode("N8");
//		BinaryNode N9 = new BinaryNode("N9");
//		BinaryNode N4 = new BinaryNode("N4", N8, N9);
//		BinaryNode N5 = new BinaryNode("N5");
//		BinaryNode N2 = new BinaryNode("N2", N4, N5);
//		BinaryNode N3 = new BinaryNode("N3", N6, N7);
//		BinaryNode N1 = new BinaryNode("N1", N2, N3);

//		binaryTree.preOrderTraversal(N1);
//		binaryTree.inOrderTraversal(N1);
//		binaryTree.postOrderTraversal(N1);

//		binaryTree.root=N1;
//		binaryTree.levelOrderTraversal();

//		binaryTree.root=N1;
//		binaryTree.search("N15");
//
//		binaryTree.insert("N1");
//		binaryTree.insert("N2");
//		binaryTree.insert("N3");
//		binaryTree.insert("N4");
//		binaryTree.insert("N5");
//		binaryTree.insert("N6");
//		binaryTree.insert("N7");
//		binaryTree.insert("N8");
//		binaryTree.insert("N9");
//		System.out.println();

//		binaryTree.deleteNode("N4");
//		binaryTree.levelOrderTraversal();

//		BinaryTreeArray binaryTree = new BinaryTreeArray(9);
//		binaryTree.insert("N1");
//		binaryTree.insert("N2");
//		binaryTree.insert("N3");
//		binaryTree.insert("N4");
//		binaryTree.insert("N5");
//		binaryTree.insert("N6");
//		binaryTree.insert("N7");	
//		binaryTree.insert("N8");
//		binaryTree.insert("N9");
//		System.out.println();

//		binaryTree.preOrderTraversal(1);
//		binaryTree.inOrderTraversal(1);
//		binaryTree.postOrderTraversal(1);

//		binaryTree.levelOrderTraversal();

//		binaryTree.search("N8");

		BinarySearchTreeLinkedList bst = new BinarySearchTreeLinkedList();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		
		System.out.println();
//		bst.preOrderTraversal(bst.root);
//		bst.inOrderTraversal(bst.root);
//		bst.postOrderTraversal(bst.root);
//		bst.levelOrderTravsersal(bst.root);
//		System.out.println(bst.search(bst.root, 10).value);
		bst.levelOrderTravsersal(bst.root);
		bst.delete(bst.root, 90);
		System.out.println();
		bst.levelOrderTravsersal(bst.root);

	}

}
