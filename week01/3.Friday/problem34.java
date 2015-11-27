
public class problem34 {
	public static int friday_years(int start, int end) {
		int counter = 0;
		int day = 4;
		if (start < 2015) {
			for (int i = 2014; i >= start; i--) {
				day--;
				if ((i % 4 == 0 && i % 100 != 0) ||( i % 100 == 0 && i % 400 == 0))
					{
					System.out.println(i);
					day--;
					}
				if (day < 1)
					day += 7;
			}
		}
		return day;

	}

	public static void main(String[] args) {
		System.out.println(friday_years(1007, 2012));
	}

}
