package week02;

public class problem20 {
	public static int maxEqualConsecutive(int[] items) {
		int counterMax = 0;
		int counter = 1;
		for (int i = 1; i < items.length; i++) {
			if (items[i - 1] == items[i]) {
				counter++;
			} else {
				if (counter > counterMax)
					counterMax = counter;
				counter = 1;
			}
		}
		if (counter > counterMax) {
			return counter;
		}
		return counterMax;
	}

	public static void main(String[] args) {
		System.out.println(maxEqualConsecutive(new int[] { 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5 }));
	}

}
