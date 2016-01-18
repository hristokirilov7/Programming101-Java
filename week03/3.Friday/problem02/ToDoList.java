package problem02;

import java.util.PriorityQueue;

public class ToDoList {
	private PriorityQueue<Task> listOfTasks;
	private double timeLeft;

	public ToDoList() {
		listOfTasks = new PriorityQueue<>();
		timeLeft = 0;
	}

	public ToDoList(double timeLeft)
	{
		listOfTasks = new PriorityQueue<>();
		this.timeLeft = timeLeft;
	}
	
	public ToDoList(Task newTask, double timeLeft) {
		listOfTasks = new PriorityQueue<>();
		listOfTasks.add(newTask);
		this.timeLeft = timeLeft;
	}

	void add(Task t) {
		listOfTasks.add(t);
	}

	void markFinished(Task t) {
		if (t.getTime() <= timeLeft && listOfTasks.remove(t)) {
			timeLeft -= t.getTime();
		}
	}

	void markCancelled(Task t) {
		listOfTasks.remove(t);
	}

	Task getTop() {
		return listOfTasks.peek();
	}

	boolean canFinish() {
		double aviableTime = timeLeft;
		for (Task it : listOfTasks) {
			aviableTime -= it.getTime();
			if (aviableTime < 0)
				return false;
		}
		return true;
	}

	double getRemainigTime() {
		return timeLeft;
	}
}
