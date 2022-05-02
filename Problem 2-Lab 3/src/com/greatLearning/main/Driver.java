package com.greatLearning.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import com.greatLearning.service1.BinarySearchTree;
import com.greatLearning.service2.Node;
import com.greatLearning.service3.BST_to_List;
import com.greatLearning.service4.Check_Pair_Sum;

public class Driver {
	public static void main(String[] args) {

//Taking input of how many nodes user wants in BST.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number of nodes in BST");
		int no_of_nodes = sc.nextInt();
		System.out.println("-----------------------------");

//Storing the values given by the user in a stack.
		Stack<Integer> st = new Stack<>();
		for (int i = 1; i <= no_of_nodes; i++) {
			System.out.println("Enter value " + i);
			st.push(sc.nextInt());
		}

//Taking input of Sum corresponding to which pair is to be found.
		System.out.println();
		System.out.println("Enter the SUM value, for which Pair is to be found");
		int target = sc.nextInt();
		sc.close();

//Creating BST from the values given by the user.
		BinarySearchTree obj = new BinarySearchTree();
		Node root = obj.CreateBST(st);

		BST_to_List obj2 = new BST_to_List();
		ArrayList<Integer> result = new ArrayList<>();
		result = obj2.inorder_traversal(root);

		Check_Pair_Sum obj3 = new Check_Pair_Sum();
		obj3.check_pair(target, result);
	}
}
