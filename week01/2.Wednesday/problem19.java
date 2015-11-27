
public class problem19 {
	public static boolean isPalindrome(String argument)
	{
		for (int i = 0; i < argument.length()/2; i++)
			if(argument.charAt(i) != argument.charAt(argument.length()-1-i))
				return false;
		return true;
	}
	
	public static void main(String[] args)
	{
		
	}

}
