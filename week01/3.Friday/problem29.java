
public class problem29 {
	public static boolean[] convertBinary(int number) {
		int size = 20, i = 0;
		boolean[] array = new boolean[size];
		for (; number != 0; i++) {
			if (i == size) {
				size *= 2;
				boolean[] tmp = new boolean[size];
				for (int j = 0; j < i; j++)
					tmp[j] = array[j];
				array = tmp;
			}

			if (number % 2 == 0) {
				array[i] = false;
			} else {
				array[i] = true;
			}
			number /= 2;
		}

		boolean[] tmp = new boolean[i];
		for (int j = 0; j < i; j++)
			tmp[j] = array[j];
		array = tmp;
		return array;
	}

	public static boolean isHack(int n) {
		boolean[] array = convertBinary(n);
		if (array.length % 2 == 0 || array[array.length / 2] == false)
			return false;
		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			if (array[i] != array[j])
				return false;
		}
		return true;
	}

	public static int nextHack(int n) {
		while (!isHack(n))
			n++;
		return n;
	}

	public static void main(String[] args) {
		System.out.println(nextHack(8181));
	}

}
