package problem10;

class Node<T> {
	T info;
	Node<T> previos;

	Node(T info) {
		this.info = info;
		previos = null;
	}

	Node (T info, Node<T> previos)
	{
		this.info = info;
		this.previos = previos;
	}
}

public class Stack<T> {
	private Node<T> end;

	public Stack() {
		end = null;
	}

	public Stack(T info) {
		end = new Node<>(info);
	}

	public void push(T info) {
		end = new Node<>(info, end);
	}

	public void pop() {
		end = end.previos;
	}

	public T top() {
		return end.info;
	}

	public boolean isEmpty() {
		return end == null;
	}
}
