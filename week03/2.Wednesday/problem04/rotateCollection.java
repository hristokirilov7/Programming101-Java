package problem04;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class rotateCollection {
	public static <T> void rotate(Collection<T> collection, int rotateStep) {
		if (rotateStep == 0)
			return;
		Deque<T> myDeque = new ArrayDeque<>();
		myDeque.addAll(collection);
		if (rotateStep > 0) {
			for (int i = 0; i < rotateStep; i++) {
				myDeque.addFirst(myDeque.getLast());
				myDeque.removeLast();
			}
		} else {
			for (int i = 0; i > rotateStep; i--) {
				myDeque.addLast(myDeque.getFirst());
				myDeque.removeFirst();
			}
		}
		collection.clear();
		collection.addAll(myDeque);
	}

}
