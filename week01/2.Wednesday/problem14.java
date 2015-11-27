
public class problem14 {
	public static int maxSpan(int[] numbers)
	{
		int span = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if(span > numbers.length - i)
				break;
			int j = numbers.length - 1;
			for ( ; numbers[j] != numbers[i] && span < j - i + 1; j--){}
			if (span < j - i + 1)
				span = j - i + 1;
		}
		return span;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 4, 2, 1, 4, 4, 4};
		System.out.println(maxSpan(array));
	}
}
