package com.greatLearning.main;

import java.util.Scanner;

import com.greatLearning.service1.Parantheses;

public class Driver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input_str = sc.nextLine();
		sc.close();
		Parantheses obj = new Parantheses();
		obj.check_balanced(input_str);

	}
}
