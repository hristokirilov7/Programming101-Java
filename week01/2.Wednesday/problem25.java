
public class problem25 {
	public static int sumOfNumbers(String input) {
		int sum = 0;
		int tmp = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				tmp *= 10;
				tmp += input.charAt(i) - '0';
			} else if (tmp != 0) {
				sum += tmp;
				tmp = 0;
			}
		}
		sum+= tmp;
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfNumbers("12 99 1"));
	}
}
