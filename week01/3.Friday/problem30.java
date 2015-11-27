
public class problem30 {

	public static int countVowels(String str) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			for (int j = 0; j < vowels.length; j++) {
				if (letter == vowels[j] || letter == vowels[j] + 'A' - 'a')
					counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(countVowels("A nice day to code!"));
	}

}
