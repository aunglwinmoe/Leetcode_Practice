package algorithm;

import java.util.Arrays;

public class BoatToSave {

	public static void main(String[] args) {
		 System.out.println(numRescueBoats(new int[] { 1, 2 }, 3));
		// // System.out.println(numRescueBoats(new int[] { 3, 2, 2, 1 }, 3));
		System.out.println(numRescueBoats(new int[] { 3, 5, 3, 4 }, 5));
		 System.out.println(numRescueBoats(new int[] { 3, 2, 2, 1 }, 3));
		// // //
		 System.out.println(numRescueBoats(new int[] { 2, 4 }, 5));
		// //
		 System.out.println(numRescueBoats(new int[] { 3, 1, 7 }, 7));
		//
		 System.out.println(numRescueBoats(new int[] { 5, 5, 1, 4, 2 }, 5));
		 System.out.println(numRescueBoats(new int[] { 3,8,7,1,4 }, 9));

	}

	public static int numRescueBoats(int[] people, int limit) {
		int count = 0;
		if (people.length == 2) {
			if (people[0] + people[1] <= limit)
				return 1;
			else
				return 2;
		}

		boolean flag = false;
		for (int i = 0; i < people.length; i++) {
			if (people[i] == limit && people[i] > 0) {
				people[i] = 0;
				count++;
			} else {
				if (people[i] > 0) {
					if (i == people.length - 1 && people[i] > 0 && people[i] <= limit) {
						count++;
						people[i] = 0;
						break;
					}
					for (int j = i; j < people.length - 1; j++) {
						if (people[i] > 0 && people[j] > 0 && (people[i] + people[j + 1] <= limit)) {
							flag = true;
							people[j + 1] = 0;
							people[i] = 0;
							break;
						}
					}
					if (flag) {
						count++;
						people[i] = 0;
						flag = false;
					} else {
						count++;
						people[i] = 0;
					}
				}
			}
		}
		return count;
	}
}
