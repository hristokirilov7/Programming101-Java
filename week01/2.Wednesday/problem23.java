
public class problem23 {
	public static int countOcurrences(String needle, String haystack) {
		if (haystack.length() < needle.length()) {
			return 0;
		}
		int counter = 0;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				for (int j = 1, k = i + 1; j < needle.length(); j++, k++) {
					if (haystack.charAt(k) != needle.charAt(j))
						break;
					if (needle.length() - 1 == j) {
						counter++;
						i = k;
					}
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(countOcurrences("da", "daaadaadada"));
	}

}
