package problem01;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunnyArraySorter {
	private Integer pivot;

	public FunnyArraySorter(Integer pivot) {
		this.pivot = pivot;
	}

	public void reverseSort(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				return b.compareTo(a);
			}

		});
	}

	public void pivotSubtractionSort(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				if (a - pivot > b)
					return 1;
				if (a - pivot == b)
					return 0;
				return -1;
			}

		});
	}

	public void pivotDivisionSort(List<Integer> list) {
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
				if (a / pivot > b)
					return 1;
				if (a / pivot == b)
					return 0;
				return -1;
			}
		});
	}

}
