package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GFG {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		HashSet<Integer> h = new HashSet<>();
		int[] input = { 3, 4, 5, 5, 7, 4, 4, 4, 1, 2, 2, 2, 2, 2, 2, 4, 4, 1, 1 };
		int[] result = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			h.add(input[i]);
		}

		Iterator<Integer> i = h.iterator();
		while (i.hasNext()) {
			int count = 0;
			int data = i.next();
			for (int k = 0; k < input.length; k++) {
				if (data == input[k]) {
					count++;
				}
			}
			map.put(data, count);
		}

		Set<Entry<Integer, Integer>> set = map.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		int z = 0;
		for (Map.Entry<Integer, Integer> entry : list) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(" Key === " + key + " Value === " + val);
			for (int l = 0; l < val; l++) {
				result[z] = key;
				z++;
			}
		}
		System.out.println(" array " + Arrays.toString(result));
	}
}
