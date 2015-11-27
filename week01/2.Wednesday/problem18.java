
public class problem18 
{
	public static String reverseEveryChar(String arg)
	{
		char[] newString = new char [arg.length()];
		for (int i = 0; i < newString.length; i++)
			newString[i] = arg.charAt(i);
		for (int i = 0, j = 0; i < newString.length; i++)
			if (!((newString[i] >= 'a' && newString[i] <= 'z')|| (newString[i] >= 'A' && newString[i] <= 'Z')))
			{
				for (int k = i-1; k > j; k--, j++)
				{
					char tmp = newString[k];
					newString[k] = newString[j];
					newString[j] = tmp;
				}
				j = i + 1;
			}
		return new String (newString);
	}
	
	public static void main(String[] args) 
	{
		String tmp = "hello  world";
		System.out.println(reverseEveryChar(tmp));
	}

}
