package com.greatLearning.service1;

import java.util.Stack;

public class Parantheses {

	public void check_balanced(String str) {
		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
//Only opening brackets will be pushed into the stack.

			char ch = str.charAt(i);
			if ((ch == '(') || (ch == '{') || (ch == '['))
				st.push(ch);

			else if (ch == ')') {
				boolean value = handleClosing(st, '(');
				if (value == false) {
					System.out.println("Entered string does not contain balanced brackets");
					return;
				}
			} else if (ch == '}') {
				boolean value = handleClosing(st, '{');
				if (value == false) {
					System.out.println("Entered string does not contain balanced brackets");
					return;
				}
			} else if (ch == ']') {
				boolean value = handleClosing(st, '[');
				if (value == false) {
					System.out.println("Entered string does not contain balanced brackets");
					return;
				}
			}

		}
// If no. of opening brackets are more than closing brackets,then stack will have elements even after loop ends.
		if (st.size() == 0)
			System.out.println("Entered string has balanced brackets");
		else
			System.out.println("Entered string does not contain balanced brackets");
	}

	public boolean handleClosing(Stack<Character> st, char opening_bracket) {

// If no. of closing brackets are more than opening brackets, then  stack will be empty at a closing bracket
		if (st.size() == 0)
			return false;

		else if (st.peek() != opening_bracket)
			return false;
		else {
			st.pop();
			return true;
		}

	}
}