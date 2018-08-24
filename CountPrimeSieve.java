package algorithm;

import java.util.Arrays;

//fillSieve
public class CountPrimeSieve {

	public static void main(String[] args) {
		System.out.println(fillSieve(10));
		System.out.println(fillSieve(499979));
		System.out.print(fillSieve(1500000));
	}

	public static int fillSieve(int n) {
		if (n <= 2)
			return 0;
		boolean[] primes = new boolean[n];
		int count = 0;
		Arrays.fill(primes, true); // assume all integers are prime.
		primes[0] = primes[1] = false; // we know 0 and 1 are not prime.
		primes[2] = true;
		for (int i = 2; i < primes.length; i++) {
			// if the number is prime,
			// then go through all its multiples and make their values false.
			if (primes[i]) {
				for (int j = 2; i * j < primes.length; j++) {
					primes[i * j] = false;
				}
			}
		}
		for (int k = 2; k < primes.length; k++) {
			if (primes[k]) {
				count++;
			}
		}
		return count;
	}
}
