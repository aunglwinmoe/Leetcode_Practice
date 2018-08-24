package algorithm;

/*
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Note: Given n will be a positive integer.
Example:
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
public class ClimbStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(5));
		System.out.println(climbStairs(4));
	}

	/*
	 * Complexity Analysis	 
       Time complexity : O(n) Single loop up to n is required to calculate nth fibonacci number.
       Space complexity : O(1) Constant space is used. 
	 */
	public static int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}
}
