
public class problem15 {
	public static boolean canBalance(int[] numbers)
	{
		int sumLeft = 0, sumRight = 0;
		for (int i = 0, j = numbers.length - 1; i <= j; )
		{
			if (sumLeft < sumRight)
				sumLeft += numbers[i++];
			else
				sumRight += numbers[j--];
		}
		return sumLeft == sumRight;
	}
	
	public static void main(String[] args)
	{
		/*int[] array = {10, 10};
		System.out.println(canBalance(array));*/
		int [][] array = new int[10][];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = new int[i+1];
			for (int j = 0; j <= i; j++)
				array[i][j] = j;
		}
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		
	}
}
