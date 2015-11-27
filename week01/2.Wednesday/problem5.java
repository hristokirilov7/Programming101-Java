
public class problem5 {
	public static int getAverage (int[] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		sum /= array.length;
		return sum;
	}
	
	public static void main (String[] args)
	{
		int[] array;
		array = new int[10];
		for (int i = 0; i < 10; i++)
			array[i] = 10 - i;
		System.out.println(getAverage(array));
	}
}
