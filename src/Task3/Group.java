package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Group {
	private List<Student> students;

	public Group(final List<Student> students) {this.students = students;}

	public List<Student> getStudents() {return students;}

	public void setStudents(final List<Student> students) {this.students = students;}

	public void addSubject(final List<Subject> subjects, final String name) {
		final Subject subject = new Subject(name);
		subjects.add(subject);

		final List<Grade> grade = new ArrayList<>(students.size());
		for (int i = 0; i < students.size(); i++) {
			final Grade grade1 = new Grade();
			grade.add(grade1);
		}
		for (int i = 0; i < students.size(); i++) {
			students.get(i).getGrades().add(grade.get(i));
		}
	}

	@Override
	public String toString() {
		String result = "";                                       // Вивід інформації про студентів
		for (final Student student : students) {
			result += "Student { " + "name: " + student.getName() +
					", lastname: " + student.getLastname();
			for (final Subject subject : student.getSubject()) {
				result += ", subject: " + subject.getNameSubject() + "{ ";
				for (final Integer txt : student.getGrades().get(student.getSubject().indexOf(subject)).getGrade())
					result += txt + " ";
				result += "}";
			}
			result += " }" + '\n';
		}
		return result;
	}

	public Student bestStudentStream() {
		return students.stream()
				.reduce((a, b) -> a.averageMark() > b.averageMark() ? a : b)
				.get();
	}

	public List<Student> filterStudent() {
		return students.stream()
				.filter(e -> e.averageMark() > 3)
				.toList();
	}

	public List<Student> sortGroup() {
		return students.stream()
				.sorted((o1, o2) -> {
					if (o1.getLastname() != o2.getLastname())
						return o1.getLastname().compareTo(o2.getLastname());
					else if (o1.getName()!= o2.getName())
						return o1.getName().compareTo(o2.getName());
					else return o1.getFatherName().compareTo(o2.getFatherName());
				}).collect(Collectors.toList());
	}

	public String printSurnameHyphen() {
		return students.stream()
				.map(Student::getLastname)
				.reduce((s1, s2) -> s1 + "-" + s2).orElse("No");
	}
}

