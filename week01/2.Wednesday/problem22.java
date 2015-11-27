
public class problem22
{
	public static int getPalindromeLength(String input)
	{
		int starPosition = input.indexOf('*');
		int left = starPosition - 1;
		int right = starPosition + 1;
		int counter = 0;
		while (input.charAt(left) == input.charAt(right))
		{
			left--;
			right++;
			counter++;
			if (left < 0 || right > input.length())
				break;
		}
		return counter;
	}

	public static void main(String[] args)
	{
		System.out.println(getPalindromeLength(new String ("daz*zad")));
	}

}
