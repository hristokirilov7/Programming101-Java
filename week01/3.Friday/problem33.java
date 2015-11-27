
public class problem33 {
	public static char[] numbersToMessage(int[] pressedSequence) {
		int size = 10;
		char[] messege = new char[size];
		boolean flag = true;
		for (int i = 0, j = -1; i < pressedSequence.length; i++) {
			if (j + 1 == size) {
				size *= 2;
				char[] tmp = new char[size];
				for (int l = 0; l <= j; l++)
					tmp[l] = messege[l];
				messege = tmp;
			}
			if (pressedSequence[i] == 0)
				messege[++j] = ' ';
			else if (pressedSequence[i] == 1)
				continue;
			else if (pressedSequence[i] == -1) {
				flag = false;
			} else if (i == 0 || pressedSequence[i] != pressedSequence[i - 1] || flag == false) {
				messege[++j] = 'a';
				messege[j] += (pressedSequence[i] - 2) * 3;
				if (pressedSequence[i] > 7 && pressedSequence[i] <= 9)
					messege[j]++;
				if (i != 0 && pressedSequence[i - 1] == 1)
					messege[j] += 'A' - 'a';
				flag = true;
			} else if (pressedSequence[i] == pressedSequence[i - 1] && pressedSequence[i] != 0) {
				messege[j]++;
				int counter = 1;
				for (int k = i - 1; k >= 0 && pressedSequence[k] == pressedSequence[k + 1]; k--, counter++) {
				}
				if (pressedSequence[i] == 7 || pressedSequence[i] == 9) {
					if (counter % 5 == 0)
						messege[j] -= 4;
				} else if (counter % 4 == 0) {
					messege[j] -= 3;
				}
			}
		}
		return messege;
	}

	public static int[] messageToNumbers(char[] message) {
		int size = 10, j = -1;
		int lastNum = 10;
		int[] pressedSequence = new int[size];
		for (int i = 0; i < message.length; i++) {
			if (j == size) {
				size *= 2;
				int[] tmp = new int[size];
				for (int l = 0; l < j; l++)
					tmp[l] = pressedSequence[l];
				pressedSequence = tmp;
			}
			if (message[i] == ' ')
				pressedSequence[++j] = 0;
			else if (message[i] >= 'A' && message[i] <= 'Z') {
				pressedSequence[++j] = 1;
				message[i] += 'a' - 'A';
			}
			if (message[i] >= 'a' && message[i] <= 'z') {
				int num = message[i] - 'a';
				int pressedNumber;
				if (num < 15) {
					pressedNumber = num / 3 + 2;
					num %= 3;
				} else {
					num -= 15;
					if (num <= 3)
						pressedNumber = 7;
					else if (num <= 6) {
						pressedNumber = 8;
						num -= 4;
					} else {
						pressedNumber = 9;
						num -= 7;
					}
				}
				if (i > 0 && lastNum == pressedNumber)
					pressedSequence[++j] = -1;
				for (; num >= 0; num--)
					pressedSequence[++j] = pressedNumber;
				lastNum = pressedNumber;
			}
		}
		int tmp[] = new int[j + 1];
		for (int i = 0; i <= j; i++)
			tmp[i] = pressedSequence[i];
		pressedSequence = tmp;
		return pressedSequence;
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 1, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2 };
		char[] array2 = { 'a', 'b', 'c' };
		// System.out.println(numbersToMessage(array));
		array = messageToNumbers(array2);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

}