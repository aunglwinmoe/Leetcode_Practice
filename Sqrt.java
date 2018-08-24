package algorithm;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println(mySqrt(9));
		System.out.println(mySqrt(8));
	}

	public static int mySqrt(int x) {
		int result = 0;
		if (x > 0) {
			result = (int) Math.floor(Math.sqrt(x));
		}
		return result;
	}
}
