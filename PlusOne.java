package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */
public class PlusOne {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {})));
		System.out.println(Arrays.toString(plusOne(new int[] { 0 })));
		System.out.println(Arrays.toString(plusOne(new int[] { 9 })));
		System.out.println(Arrays.toString(plusOne(new int[] { 1, 2 })));
		System.out.println(Arrays.toString(plusOne(new int[] { 1, 2, 3 })));
		System.out.println(Arrays.toString(plusOne(new int[] { 2, 99 })));
		System.out.println(Arrays.toString(plusOne(new int[] { 9, 9 })));
	}

//	public static int[] plusOne(int[] digits) {
//		// --------Plus One--------
//		if (digits.length == 1) {
//			digits[0]++;
//		} else if (digits.length > 1) {
//			if (digits[digits.length - 1] > digits[0]) {
//				digits[digits.length - 1]++;
//			} else if ((digits[0] > digits[digits.length - 1]) || (digits[0] == digits[digits.length - 1])) {
//				digits[digits.length - 1]++;
//			}
//		}
//
//		// --------Include zero itself--------
//		int count = 0;
//		for (int i = 0; i < digits.length; i++) {
//			if (digits[i] % 10 == 0) {
//				Integer a = (digits[i] / 10);
//				count += a.toString().length();
//			}
//		}
//
//		int[] result = new int[digits.length + count];
//		if (count > 0) {
//			int lastIndex = digits.length - 1;
//			if (digits[lastIndex] % 10 == 0) {
//				String[] s = String.valueOf(digits[lastIndex]).split("");
//				System.arraycopy(digits, 0, result, 0, digits.length - 1);
//				int j = digits.length - 1;
//				for (int k = 0; k < s.length; k++) {
//					result[j] = Integer.parseInt(s[k]);
//					j++;
//				}
//			}
//		}
//		return (count > 0) ? result : digits;
//	}
	public static int[] plusOne(int[] digits) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (digits == null || digits.length == 0) {
            int[] temp = {1};
            return temp;
        }
         
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                carry = carry + digits[i] + 1;
            } else {
                carry += digits[i];
            }
            result.add(0, carry % 10);
            carry /= 10;
        }
         
        if (carry == 1) {
            result.add(0, 1);
        }
        int resultArray[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
         
        return resultArray;
    }

}
