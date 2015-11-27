
public class maybeProblem10 {
	public static int[] histogram(short[][] image)
	{
		int[] result = new int [255];
		for (int i = 0; i < 255; i++)
			result[i] = 0;
		for (int i = 0; i < image.length; i++)
			for(int j = 0; j < image[i].length; j++)
				result[image[i][j]]++;
		return result;
	}
}
