package problem02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class ReverseCollection {

	static <T> void reverse(Collection<T> collection) {
		Stack<T> tmp = new Stack<>();
		tmp.addAll(collection);
		collection.clear();
		collection.addAll(tmp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> tmp = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			tmp.add(i);
		reverse(tmp);
		for (int i = 0; i < 10; i++)
			System.out.print(tmp.get(i));

	}

}
