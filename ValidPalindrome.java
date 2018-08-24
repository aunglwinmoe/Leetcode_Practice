package algorithm;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Note: For the purpose of this problem, we define empty string as valid palindrome.
Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false

Example 3:
Input: "ABCDCBA"
Output: true
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
	}

	public static boolean isPalindrome(String s) {
		String[] arr = s.split("");
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			while (isAlphaNumeric(arr[i]) == false && i < j) {
				i++;
			}
			while (isAlphaNumeric(arr[j]) == false && i < j) {
				j--;
			}
			if (!arr[i].toLowerCase().equals(arr[j].toLowerCase()))
				return false;
		}
		return true;
	}

	public static boolean isAlphaNumeric(String s) {
		return s.matches("[a-zA-Z0-9]+");
	}
}
