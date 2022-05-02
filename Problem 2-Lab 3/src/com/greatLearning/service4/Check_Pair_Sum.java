package com.greatLearning.service4;

import java.util.ArrayList;

public class Check_Pair_Sum {
	public void check_pair(int target, ArrayList<Integer> list) {

		// Using two-pointers technique to check for given pair.
		int left = 0;
		int right = list.size() - 1;

		while (right > left) {
			int calculated_sum = list.get(left) + list.get(right);
			if (calculated_sum == target) {
				System.out.println("Pair is-" + '(' + list.get(left) + ',' + list.get(right) + ')');
				return;
			}
			// Decrementing the right pointer, moving towards smaller value, leftward.
			else if (calculated_sum > target)
				right--;

			// Incrementing the left pointer, moving towards larger value, rightward.
			else {
				left++;
			}
		}
		System.out.println("No such node pair exists");
	}

}
