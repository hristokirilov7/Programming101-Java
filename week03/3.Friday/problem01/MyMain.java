package problem01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMain {
	public void sortStudents(List<Student> allStudents) {
		// return Collections.sort(allStudents);

	}

	public static void main(String[] args) {
		List<Student> myList = new ArrayList<>();
		for (Integer i = 0; i < 10; i++)
			myList.add(new Student("Student" + i, i % 4 + 2));
		Collections.sort(myList);
		for (int i = 0; i < myList.size(); i++)
			myList.get(i).print();
	}
}
