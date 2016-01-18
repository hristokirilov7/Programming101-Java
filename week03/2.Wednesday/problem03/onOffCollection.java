package problem03;

import java.util.HashSet;

public class onOffCollection<E> extends HashSet<E> {

	public boolean add(E newElem) {
		if (super.contains(newElem)) {
			super.remove(newElem);
			return false;
		} else
			super.add(newElem);
		return true;
	}
}