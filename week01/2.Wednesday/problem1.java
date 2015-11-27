
public class problem1 {
	public static boolean isOdd (int n)
	{
		if (n % 2 == 1)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(isOdd(n));
	}
}
