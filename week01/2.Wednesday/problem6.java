
public class problem6 {
	
	public static long fac (long n)
	{
		long fact = n;
		for (n--; n > 0; n--)
			fact *= n;
		return fact;
	}
	
	public static long doubleFac (int n)
	{
		long newN = fac(n);
		return fac(newN);
	}
	
	public static void main (String[] args)
	{
		System.out.println(doubleFac(3));
	}
}
