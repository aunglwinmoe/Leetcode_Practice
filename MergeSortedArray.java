package algorithm;

import java.util.Arrays;

//Input:
// nums1 = [1,2,3,0,0,0], m = 3
// nums2 = [1,2,6], n = 3
// Output: [1,2,2,3,5,6]
public class MergeSortedArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3)));
		System.out.println(Arrays.toString(merge(new int[] { 1 }, 1, new int[] {}, 0)));
		System.out.println(Arrays.toString(merge(new int[] { 0 }, 0, new int[] { 1 }, 1)));
		System.out.println(Arrays.toString(merge(new int[] { 1, 2, 4, 5, 6, 0 }, 5, new int[] { 3 }, 1)));
	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
		return nums1;
	}
}
