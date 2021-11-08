package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final Subject math = new Subject("Math");
		final Subject english = new Subject("English");
		final Subject physics = new Subject("Physics");
		final Subject chemistry = new Subject("Chemistry");

		final List<Subject> subjects = new ArrayList<>();
		subjects.add(math);
		subjects.add(english);
		subjects.add(physics);
		subjects.add(chemistry);

		final Student s1 = new Student("Taras", "Biliy", "Petrovich", subjects);
		final Student s2 = new Student("Ivan", "Petrenko", "Ivanovich", subjects);
		final Student s3 = new Student("Stepan", "Srepanov", "Bohdanovich", subjects);
		final Student s4 = new Student("David", "Dam", "Damidovich", subjects);

		final List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		final StudentSimple studentSimples = new StudentSimple();
		studentSimples.transformed(students);

		students.get(0).addMark(4, "Math");
		students.get(1).addMark(2, "Math");
		students.get(2).addMark(4, "Math");
		students.get(3).addMark(5, "Math");

		students.get(0).addMark(4, "English");
		students.get(1).addMark(3, "English");
		students.get(2).addMark(5, "English");
		students.get(3).addMark(5, "English");

		students.get(0).addMark(3, "Physics");
		students.get(1).addMark(5, "Physics");
		students.get(2).addMark(2, "Physics");
		students.get(3).addMark(5, "Physics");

		students.get(0).addMark(4, "Chemistry");
		students.get(1).addMark(2, "Chemistry");
		students.get(2).addMark(4, "Chemistry");
		students.get(3).addMark(5, "Chemistry");

		System.out.println("Average mark is:");
		System.out.println(s1.averageMark());

		System.out.println(s1.distinctEnglish());

		final Group group = new Group(students);
		System.out.println("Best student's information: ");
		System.out.println(group.bestStudentStream());

		System.out.println("Sorted without '3' mark: ");
		System.out.println(group.sortByMark());

		System.out.println("Sorted by name: ");
		System.out.println(group.sortByName());

		System.out.println("Students' lastnames: ");
		System.out.println(group.printLastnames());
	}
}
