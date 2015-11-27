
public class problem2 {
	public static boolean isPrime (int N)
	{
		for (int i = 2; i < Math.sqrt(N); i++)
			if (N % i == 0)
				return false;
		return true;
	}
	
	public static void main (String[] args)
	{
		System.out.println(isPrime(11));
	}
}
