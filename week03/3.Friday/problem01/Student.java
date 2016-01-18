package problem01;

public class Student implements Comparable<Student>{
	private String name;
	private int grade;

	public Student() {
		name = null;
		grade = 2;
	}

	public Student(String name, int grade) {
		this.name = new String(name);
		this.grade = grade;
	}

	public int compareTo(Student other) {
		if (grade > other.grade)
			return 1;
		if (grade < other.grade)
			return -1;
		return name.compareTo(other.name);
	}
	
	public void print ()
	{
		System.out.print(name + ' ');
		System.out.println(grade);
	}

}
