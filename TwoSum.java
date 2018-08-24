package algorithm;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] data = new int[] { 3, 2, 4 };
		System.out.println(Arrays.toString(twoSum(data, 6)));
	}

	//Brute Force Strategy
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target - nums[i] == nums[j]) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
}
