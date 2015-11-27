package week02;

public class problem19 {
	public static boolean IsIncreasing(int[] sequence) {
		for (int i = 0; i < sequence.length - 1; i++)
			if (sequence[i] < sequence[i + 1])
				return false;
		return true;
	}

	public static boolean IsDecreasing(int[] sequence) {
		for (int i = 0; i < sequence.length - 1; i++)
			if (sequence[i] > sequence[i + 1])
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
