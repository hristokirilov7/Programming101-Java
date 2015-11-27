
public class problem9 {
	public static int getNumDigits (long N)
	{
		int counter = 0;
		while (N > 0)
		{
			counter++;
			N /= 10;
		}
		return counter;
	}
	
	public static long getLargestPalindrome(long N)
	{
		int length = getNumDigits(N);
		long[] array = new long [length];
		for (int i = 0; i < length; i++)
		{
			array[i] = N % 10;
			N /= 10;
		}
		boolean flag = true;
		/*if (array[0] < array[length - 1])
		{
			array[length-1]--;
			flag = false;
			if(array[array.length-1] == 0)
				length--;
		}*/
		for (int i = 0, j = length - 1; i < length / 2; i++, j--)
		{
			if (flag == true)
			{
				if (array[i] < array[j])
				{
					array[j] = array[i];
					if(array[j] == 0 && i == 0)
					{
						for ( ;i < j; i++)
							array[i] = 9;
						length--;
						break;
					}
					flag = false;
				}
				else
					array[i] = array[j];
			}
			else
			{
				array[i] = 9;
				array[j] = 9;
			}
		}
		long number = 0;
		for (int i = length-1; i >= 0; i--)
		{
			number *= 10;
			number += array[i];
		}
		
		return number;
	}
	
	public static void main (String[] args)
	{
		System.out.println(getLargestPalindrome(10000));
	}
}
