
public class problem4 {
	public static void bubleSort (int[] array)
	{
		boolean flag = true;
		while (flag)
		{
			flag = false;
			for (int i = 0; i < array.length-1; i++)
				if (array[i] > array[i+1])
				{
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					flag = true;
				}
		}
	}
	
	public static int kthMin (int k, int[] array)
	{
		bubleSort(array);
		return array[k];
	}
	
	public static void main (String[] args)
	{
		int[] array;
		array = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = 10 - i;
		System.out.println(kthMin(4,array));
	}
	
}
