package problem10;

public class Minimum {
	public <T extends Comparable<T> > T findMinimum (T[] array)
	{
		T min = array[0];
		for (int i = 1; i < array.length; i++)
			if (min.compareTo(array[i]) > 0)
				min = array[i];
		return min;
	}
}
