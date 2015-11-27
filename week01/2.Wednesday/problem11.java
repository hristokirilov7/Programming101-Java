
public class problem11 {
	public static long pow(int a, int b)
	{
		int result = 1;
		while (b > 0)
		{
			if (b % 2 != 0)
				result *= a;
			a *= a;
			b /= b;
		}
		return result;
	}
	public static void main(String[] args)
	{
		
	}
}
