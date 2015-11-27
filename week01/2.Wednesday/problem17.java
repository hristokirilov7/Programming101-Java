
public class problem17 
{
	public static String reverseMe(String argument)
	{
		char[] reversedString = new char [argument.length()];
		for (int i = 0; i < reversedString.length; i++)
			reversedString[i] = argument.charAt(argument.length() - 1 - i);
		return new String (reversedString);
	}
	
	public static void main(String[] args)
	{
		String tmp = "123456789";
		System.out.println(reverseMe(tmp));
	}
}
