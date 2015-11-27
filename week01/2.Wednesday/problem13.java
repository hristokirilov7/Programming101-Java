
public class problem13 {
	public static long maximalScalarSum(int[] a, int[] b)
	{
		problem4 sort = new problem4();
		sort.bubleSort(a);
		sort.bubleSort(b);
		long sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i]*b[i];
		return sum;
	}
}
