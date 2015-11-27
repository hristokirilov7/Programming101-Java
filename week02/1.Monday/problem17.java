package week02;

public class problem17 {

	public static int fibNumber(int n) {
		int prev1 = 1;
		int prev2 = 1;
		int num = 11;
		for (int i = 3; i <= n; i++) {
			int k = prev1 + prev2;
			while (k > 0) {
				num *= 10;
				k /= 10;
			}
			num += prev1 + prev2;
			k = prev1 + prev2;
			prev2 = prev1;
			prev1 = k;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(fibNumber(8));
	}

}
