package algorithm;

public class CountDistinct {

	public static void main(String[] args) {
		System.out.println(countDistinct(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
		System.out.println(countDistinct(new int[] { 1, 1, 2 }));
		System.out.println(countDistinct(new int[] { 0, 1 }));
	}

	public static int countDistinct(int[] nums) {
		// Tested with Set
		// Set<Integer> hash_Set = new HashSet<Integer>();
		// for (int i = 0; i < nums.length; i++) {
		// hash_Set.add(nums[i]);
		// }
		// System.out.println(hash_Set);
		// return hash_Set.size();

		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i != nums.length - 1) {
				if (nums[i] != nums[i + 1])
					count++;
			} else {
				if (nums[i] != nums[i - 1])
					count++;
			}
		}
		return count;
	}
}
