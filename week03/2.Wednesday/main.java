import java.util.ArrayList;
import java.util.List;

import problem04.rotateCollection;

public class main {

	public static void main(String[] args) {
		List<Integer> tmp = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			tmp.add(i);
		rotateCollection.rotate(tmp, -5);
		for (int i = 0; i < 10; i++)
			System.out.print(tmp.get(i));

	}

}
