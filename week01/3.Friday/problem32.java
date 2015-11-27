
public class problem32 {

	public static int reverse (int n)
	{
		int s = 0;
		while (n > 0)
		{
			s *= 10;
			s += n % 10;
			n /= 10;
		}
		return s;
	}

	public static int pScore(int n) {
		problem20 Palnidrome = new problem20();
		if (Palnidrome.isPalindrome(n))
			return 1;
		return 1 + pScore(n + reverse(n));
	}

	public static void main(String[] args) {
		System.out.println(pScore(198));
	}

}
