package algorithm;

import java.util.Arrays;

// I - 1, V - 5, X - 10, L - 50, C - 100, D - 500, M - 1000
/*
Rules:
 - If I comes before V or X, subtract 1 eg: IV = 4 and IX = 9
 - If X comes before L or C, subtract 10 eg: XL = 40 and XC = 90
 - If C comes before D or M, subtract 100 eg: CD = 400 and CM = 900
 */
public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("X"));
		System.out.println(romanToInt("XI"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int check(String first, String second) {		
		if(first.equals("I")) {
			if(second.equals("V")  || (second.equals("X"))) 
				return getValue(second);
			
		}
		else if(first.equals("X")) {
			if(second.equals("L") || second.equals("C")) 
				return getValue(second);			
		}
		else if(first.equals("C")) {
			if(second.equals("D") || second.equals("M"))
				return getValue(second);
		}	
		return 0;
	}
	
	public static int getValue(String str) {
		switch(str) {
			case "M": return 1000;
			case "D": return 500; 
			case "C":  return 100;
			case "L":  return 50;
			case "X":  return 10;
			case "V":  return 5;
			default: return 1;
		}
	}

	public static int romanToInt(String s) {
		String[] arr = s.split("");
		int len = s.length();
		int result = 0;
		for (int i = 0; i < len; i++) {
			if (i < len - 1) {
				if (check(arr[i], arr[i + 1]) > 0) {
					result += getValue(arr[i + 1]) - getValue(arr[i]);
					i++;
				}
				else {
					result += getValue(arr[i]);
				}
			} else {
				result += getValue(arr[i]);
			}
		}
		return result;
	}
}
