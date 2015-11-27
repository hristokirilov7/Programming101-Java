
public class problem7 {
	public static long kthFac (int k, int n)
	{
		problem6 function = new problem6();
		long newN = n;
		for (int i = 0; i < k; i++)
			newN = function.fac(newN);
		return newN;
	}
	
	public static void main (String[] args)
	{
		System.out.println(kthFac(2,3));
	}
}
