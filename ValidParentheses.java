package algorithm;

import java.util.Stack;

public class ValidParentheses {

	/*
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order. Input: "()[]{}" Output: true Input: "(]"
	 * Output: false
	 */
	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
		System.out.println(isValid(""));
		System.out.println(isValid("]"));
		System.out.println(isValid("){"));
		System.out.println(isValid("(])"));
		System.out.println(isValid("[])"));
	}

	public static boolean checkOpen(String str) {
		if (str.equals("(") || str.equals("<") || str.equals("[") || str.equals("{")) {
			return true;
		}
		return false;
	}
	
	public static boolean checkClose(String str) {
		if (str.equals(")") || str.equals(">") || str.equals("]") || str.equals("}")) {
			return true;
		}
		return false;
	}

	public static boolean check(String str, String prev) {
		if (str.equals(")") && prev.equals("(")) {
			return true;
		} else if (str.equals("]") && prev.equals("[")) {
			return true;
		} else if (str.equals("}") && prev.equals("{")) {
			return true;
		} else if (str.equals(">") && prev.equals("<")) {
			return true;
		}
		return false;
	}	

	public static boolean isValid(String s) {
		if (s.length() == 0)
			return true;
		if (s.length() == 1)
			return false;
		if (s.startsWith(")") || s.startsWith("}") || s.startsWith("]") || s.startsWith(">"))
			return false;
		Stack<String> parentheses = new Stack<>();
		String[] arr = s.split("");
		for (int i = 0; i < arr.length; i++) {
			if (checkOpen(arr[i])) {
				parentheses.push(arr[i]);
			} else {
				if(checkClose(arr[i]) && parentheses.size() == 0) return false;
				if (check(arr[i], parentheses.peek())) {
					parentheses.pop();
				} else {
					return false;
				}
			}
		}
		return (parentheses.size() == 0) ? true : false;
	}

}
