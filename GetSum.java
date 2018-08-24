package algorithm;

import java.util.Stack;

//Can't use (+) (-) operator to sum two numbers.
public class GetSum {

	public static void main(String[] args) {
		System.out.println(getSum(2, 3));

//		System.out.println(getSum(-12, -8));
		System.out.println(getSum(-1, 1));
//		System.out.println(getSum(-14, 6));
//		System.out.println(getSum(2147483647, -2147483648));
	}

	// public static int getSum(int a, int b) {
	//// 2147483647
	//// -2147483648
	// Stack<Integer> st = new Stack<>();
	// if (a < 0 && b < 0) {
	// for (int i = 0; i < a * (-1); i++) {
	// st.push(i);
	// }
	// for (int i = 0; i < b * (-1); i++) {
	// st.push(i);
	// }
	// return st.size() * (-1);
	// }
	// if (a < 0 || b < 0) {
	// if (a < 0) {
	// for (int i = 0; i < b; i++) {
	// st.push(i);
	// }
	// for (int i = 0; i < (a * (-1)); i++) {
	// st.pop();
	// }
	// }
	// if (b < 0)
	// for (int i = 0; i < a; i++) {
	// st.push(i);
	// }
	// for (int i = 0; i < (b * (-1)); i++) {
	// st.pop();
	// }
	// } else {
	// for (int i = 0; i < a; i++) {
	// st.push(i);
	// }
	// for (int i = 0; i < b; i++) {
	// st.push(i);
	// }
	// }
	// return st.size();
	// }
	
	//---------To Ask -------------------
	public static int getSum(int a, int b) {
		if (b == 0)
			return a;
		int sum = a ^ b; // SUM of two integer is A XOR B
		System.out.println("Sum " + sum);
		int carry = (a & b) << 1; // CARRY of two integer is A AND B
		System.out.println("Carry " + carry);
		return getSum(sum, carry);
	}
}
