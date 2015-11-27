
public class problem31 {

	public static int countVowels(String str) {
		char[] vowels = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
				'z' };
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