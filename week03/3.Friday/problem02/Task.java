package problem02;

public class Task implements Comparable<Task> {
	private String taskToDo;
	private int priority;
	private double timeToDoTask;

	public Task() {
		taskToDo = null;
		priority = 0;
		timeToDoTask = 0;
	}

	public Task(String taskToDo, int priority, double timeToDoTask) {
		this.taskToDo = new String(taskToDo);
		if (priority > 0) {
			this.priority = priority;
		} else {
			this.priority = 0;
		}
		if (timeToDoTask > 0) {
			this.timeToDoTask = timeToDoTask;
		} else {
			this.timeToDoTask = 0;
		}
	}

	@Override
	public int compareTo(Task o) {

		if (priority > o.priority) {
			return 1;
		}
		if (priority < o.priority) {
			return -1;
		}
		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this.getClass().equals(obj.getClass()) == false) {
			return false;
		}
		Task other = (Task) obj;
		return taskToDo.equals(other.taskToDo) && priority == other.priority && timeToDoTask == other.timeToDoTask;
	}

	public double getTime() {
		return timeToDoTask;
	}
}
