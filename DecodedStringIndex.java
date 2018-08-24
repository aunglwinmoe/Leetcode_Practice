package algorithm;

import java.util.ArrayList;
import java.util.List;

public class DecodedStringIndex {

	public static void main(String[] args) {

		// System.out.println(decodeAtIndex("leet2code3", 10));
		// System.out.println(decodeAtIndex("ha22", 5));
		System.out.println(decodeAtIndex("a2345678999999999999999", 1));

	}

	public static String decodeAtIndex(String S, int K) {
		// StringBuffer result = new StringBuffer();
		// StringBuffer sb = new StringBuffer();
		List<String> sb = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		String[] arr = S.split("");
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].matches("[0-9]")) {
				sb.add(arr[i]);
			} else {
				// result.setLength(0);
				result = new ArrayList<String>();
				result.addAll(sb);
				for (int j = 0; j < Integer.parseInt(arr[i]) - 1; j++) {
					result.addAll(sb);
				}
				// sb.setLength(0);
				sb = new ArrayList<String>();
				sb.addAll(result);
			}
		}
		String kth = "";
		kth = result.toString().split("")[K - 1];
		return kth;

	}
}
// else {
// int j;
// for (j = 0; j < Integer.parseInt(arr[i]) - 1; j++) {
//
// result.append(sb);
// System.out.println("Arr " + arr[i] + " SB " + sb.toString() + " Result " +
// result.toString());
//
// }
// if(j == Integer.parseInt(arr[i]) -2) {
// sb.setLength(0);
// sb = new StringBuilder();
// sb.append(result);
//// sb = result;
// }
// }