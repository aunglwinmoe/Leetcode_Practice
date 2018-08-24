package algorithm;

//BruteForce
public class CountPrime {

	public static void main(String[] args) {
		System.out.println(countPrimes(10));
		System.out.println(countPrimes(5));
		System.out.println(countPrimes(7));
		System.out.println(countPrimes(4));
		System.out.println(countPrimes(2));
		System.out.println(countPrimes(1500000));
		System.out.println(countPrimes(499979));
		
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrimes(int n) {		
		if (n <= 2)
			return 0;
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
}
