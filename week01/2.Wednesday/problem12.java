
public class problem12 {
	public static int getOddOccurrence(int[] array)
	{
		problem4 sort = new problem4();
		sort.bubleSort(array);
		int elem = 1;
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] == array[i-1])
				elem++;
			else
			{
				if (elem % 2 == 1)
					return array[i-1];
				else
					elem = 1;
			}
		}
		return -1;
	}
	public static void main (String[] args)
	{
		int[] array = {1,2,2,1,3,4,3,4,4,6,5,6,5};
		System.out.println(getOddOccurrence(array));
	}
}
