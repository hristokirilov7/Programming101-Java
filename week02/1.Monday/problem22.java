package week02;

public class problem22 {
	public static int uniqueWordsCount(String[] arr) {
		int counter = 1;
		for (int i = 1; i < arr.length; i++)
		{
			boolean flag = true;
			for (int j = i -1; j >= 0 && flag; j--)
			{
				if (arr[i].equals(arr[j]))
					{
					flag = false;
					}
			}
			if (flag)
				counter++;
		}
		return counter;
		
	}

	public static void main(String[] args) {
		System.out.println(uniqueWordsCount(new String[] {"HELLO!", "HELLO!", "HELLO!", "HELLO!"}));
	}

}
