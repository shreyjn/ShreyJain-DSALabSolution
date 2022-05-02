package com.greatLearning.service1;

import java.util.Stack;

import com.greatLearning.service2.Node;

public class BinarySearchTree {

//Creating a new Node when null is encountered.
	private Node createNewNode(int val) {
		Node node = new Node();
		node.data = val;
		node.left = null;
		node.right = null;
		return node;
	}

//Inserting at proper position in BST
	private Node insert(Node node, int val) {
		if (node == null)
			return createNewNode(val);

		if (val < node.data)
			node.left = insert(node.left, val);

		else if (val > node.data)
			node.right = insert(node.right, val);

		return node;
	}

//Creating BST from input values
	public Node CreateBST(Stack<Integer> st) {
		Node root = null;
		while (st.size() != 0) {
			root = insert(root, st.pop());
		}
		return root;
	}
}