
public class problem8 {
	public static long getSmallestMulgetSmallestMultiple(int upperBound)
	{
		long n = upperBound;
		for (int i = 2; i < upperBound; i++)
			if (n % i != 0)
				n *= i;
		return n;
	}
	public static void main(String[] args) 
	{
		System.out.println(getSmallestMulgetSmallestMultiple(4));
	}
}