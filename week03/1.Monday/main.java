import problem10.Minimum;
import problem10.Stack;

public class main {

	public static void main (String[] args) {
		Integer[] array = new Integer[10];
		for (int i = 0; i < 10; i++)
			array[i] = i+1;
		array[9] = -10;
		System.out.println(new Minimum().findMinimum(array));
	}

}
