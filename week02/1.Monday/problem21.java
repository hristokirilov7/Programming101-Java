package week02;

public class problem21 {
	public static int maxIncreasingConsecutive(int[] items) {
		int maxCounter = 0;
		int counter = 1;
		for (int i = 1; i < items.length; i++) {
			if (items[i - 1] <= items[i]) {
				counter++;
			} else {
				if (counter > maxCounter)
					maxCounter = counter;
				counter = 1;
			}
		}
		if (counter > maxCounter)
			return counter;
		return maxCounter;
	}

	public static void main(String[] args) {
		System.out.println(maxIncreasingConsecutive(new int[] { 1, 2, 3, 3, 3, 3, 4, 3, 3 }));
	}

}
