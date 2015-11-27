
public class problem3 {
	public static int min (int[] array)
	{
		int min = array[0];
		for (int i = 1; i < array.length; i++)
			if (min > array[i])
				min = array[i];
		return min;
	}
	
	public static void main (String[] args)
	{
		int[] array;
		array = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = 10 - i;
		array[5] = -10;
		System.out.println(min(array));
	}
}
