
public class problem21 {
	public static String copyEveryChar(String input, int k)
	{		
		char[] array = new char [input.length()*k];
		for(int i = 0; i < input.length(); i++)
			for(int j = 0; j < k; j++)
				array[i*k + j] = input.charAt(i);
		
		
		return new String (array);
	}
	
	
	public static void main(String[] args) 
	{
		String a = "tldr";
		System.out.println(copyEveryChar(a, 3));
	}

}
