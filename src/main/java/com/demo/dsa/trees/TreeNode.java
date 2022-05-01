package com.demo.dsa.trees;

import java.util.ArrayList;

public class TreeNode {

	private String data;
	private ArrayList<TreeNode> children;

	public TreeNode(String data) {
		this.data = data;
		children = new ArrayList<>();

	}

	public void addChild(TreeNode node) {
		this.children.add(node);
	}

	public String print(int level) {
		String result = repeat("  ", level) + data + "\n";
		for (TreeNode node : children) {
			result += node.print(level + 1);
		}
		return result;
	}

	private String repeat(String str, int value) {
		String result = "";
		int i = 0;
		while (i < value) {
			result += str;
			i++;

		}
		return result;
	}

}
