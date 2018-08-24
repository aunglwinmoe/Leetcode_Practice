package algorithm;

import java.util.Arrays;

public class BoatToSave2 {

	public static void main(String[] args) {
		System.out.println(numRescueBoats(new int[] { 1, 2 }, 3));
		System.out.println(numRescueBoats(new int[] { 3, 5, 3, 4 }, 5));
		System.out.println(numRescueBoats(new int[] { 3, 2, 2, 1 }, 3));
		System.out.println(numRescueBoats(new int[] { 2, 4 }, 5));
		System.out.println(numRescueBoats(new int[] { 3, 1, 7 }, 7));
		System.out.println(numRescueBoats(new int[] { 5, 5, 1, 4, 2 }, 5));
		System.out.println(numRescueBoats(new int[] { 3, 8, 7, 1, 4, 3, 8, 7, 1, 4, 3, 8, 7, 1, 4, 3, 8, 7, 1, 4, 3, 8,
				7, 1, 4, 3, 8, 7, 1, 4, 3, 8, 7, 1, 4, 3, 8, 7, 1, 4 }, 9));
	}

	public static int numRescueBoats2(int[] people, int limit) {
		Arrays.sort(people);
		int count = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i] == limit && people[i] > 0) {
				people[i] = 0;
				count++;
			} else {
				if (people[i] > 0) {
					int num = limit - people[i];
					boolean flag = false;
					while (num > 0) {
						for (int j = i + 1; j < people.length; j++) {
							if (people[j] > 0) {
								if (people[j] == num) {
									people[j] = 0;
									people[i] = 0;
									count++;
									flag = true;
									break;
								}
							}
						}
						if (flag) {
							break;
						} else {
							num--;
						}
					}
					if (!flag) {
						count++;
						people[i] = 0;
					}
				}
			}
		}
		return count;
	}

	public static int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int count = 0;
		int i = 0, j = people.length - 1;
		while (i < j) {
			int sum = people[i] + people[j];
			if (sum <= limit) {
				count++;
				i++;
				j--;

			} else {
				count++;
				j--;
			}
			if (i == j) {
				count++;
				j--;
				i++;
			}
		}
		return count;
	}

}
