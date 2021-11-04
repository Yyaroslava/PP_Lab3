package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		final Subject english = new Subject("English");
		final Subject physic = new Subject("Physic");
		final Subject math = new Subject("Math");

		final List<Subject> subjects = new ArrayList<>();
		subjects.add(english);
		subjects.add(physic);
		subjects.add(math);

		final Student student1 = new Student("Sasha", "Braus", "Ellen", subjects);
		final Student student2 = new Student("Connie", "Springer", "Pen", subjects);
		final Student student3 = new Student("Jean", "Kirstein", "James", subjects);

		final List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);

		final StudentSimple studentSimples = new StudentSimple();
		studentSimples.transformationList(students);

		System.out.println(student1.averageMark());

		students.get(0).addGrade(5, "English");
		students.get(0).addGrade(2, "English");
		students.get(0).addGrade(2, "English");

		students.get(1).addGrade(1, "English");
		students.get(2).addGrade(3, "English");

		students.get(0).addGrade(5, "Physic");
		students.get(1).addGrade(3, "Physic");
		students.get(2).addGrade(2, "Physic");

		students.get(0).addGrade(4, "Math");
		students.get(1).addGrade(2, "Math");
		students.get(2).addGrade(1, "Math");

		final Group group = new Group(students);
		group.addSubject(subjects,"IT");

		System.out.println("Best student's information");
		System.out.println(group.bestStudentStream());

		students.get(0).addGrade(4, "IT");
		students.get(1).addGrade(3, "IT");
		students.get(2).addGrade(3, "IT");
		System.out.println(group.printSurnameHyphen());

	}
}

