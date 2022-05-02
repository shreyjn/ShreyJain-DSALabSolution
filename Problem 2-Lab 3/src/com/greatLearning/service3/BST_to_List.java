package com.greatLearning.service3;

import java.util.ArrayList;

import com.greatLearning.service2.Node;

public class BST_to_List {

//Inorder traversal of a BST will always give a sorted list.
//Storing result in a ArrayList.

	public ArrayList<Integer> inorder_traversal(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		helper(root, list);
		return list;
	}

	private void helper(Node root, ArrayList<Integer> list) {
		if (root == null)
			return;
		helper(root.left, list);
		list.add(root.data);
		helper(root.right, list);
	}

}