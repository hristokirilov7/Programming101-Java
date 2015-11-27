
public class problem20 
{
	public static boolean isPalindrome(int argument)
	{
		int countDigits = 0;
		for (int k = argument; k > 0; countDigits++)
			k /= 10;
		int[] number = new int [countDigits];
		for (int i = 0; i < number.length; i++)
		{
			number[i] = argument%10;
			argument /= 10;
		}
		for (int i = 0; i < number.length / 2; i++)
			if (number[i] != number[number.length - 1 - i])
				return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome(123321));
	}

}
