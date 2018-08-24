package algorithm;

import java.util.Arrays;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-123));
		System.out.println(reverse(120));
	}

	public static int reverse(int x) {
		System.out.println(Integer.MAX_VALUE/10);
		System.out.println(Integer.MIN_VALUE);
		
		
		int data = (x < 0) ? (-1) * x : x;
		int len = Integer.toString(data).length();
		int[] arr = new int[len];
		int numerator = data;
		for (int i = 0; i < arr.length; i++) {
			int remainder = 0;
			remainder = numerator % 10;
			numerator = numerator / 10;
			if (remainder != 0) {
				arr[i] = remainder;
			}
		}
		StringBuilder res = new StringBuilder();
		for (int j = 0; j < arr.length; j++) {
			res.append(arr[j]);
		}

		int result = Integer.parseInt(res.toString());
		return (x < 0) ? (-1) * result : result;
	}
}
