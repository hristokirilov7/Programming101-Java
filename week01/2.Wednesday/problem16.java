
public class problem16 {
	public static int[][] rescale(int[][] original, int newWidth, int newHeight)
	{
		double x = original.length/(double)newWidth;
		double y = original[0].length/(double)newHeight;
		int[][] newImg = new int[newWidth][newHeight];
		for (int i = 0; i < newWidth; i++)
			for (int j = 0; j < newHeight; j++)
			{
				int oldX = (int)Math.floor(i*x);
				int oldY = (int)Math.floor(j*y);
				newImg[i][j] = original[oldX][oldY];
			}
		return newImg;
	}
	
	public static void main(String[] args) 
	{
		int[][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		arr = rescale(arr, 3,3);
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
}