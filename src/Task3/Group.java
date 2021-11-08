package Task3;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Group {
	private List<Student> students;

	public Group(final List<Student> students) { this.students = students; }

	public Student bestStudentStream() {
		return students.stream()
				.reduce((a, b) -> a.averageMark() > b.averageMark() ? a : b)
				.get();
	}

	public List<Student> sortByMark() {
		return students.stream()
				.filter(e -> e.averageMark() > 3).collect(Collectors.toList());
	}

	public List<Student> sortByName() {
		return students.stream()
				.sorted((o1, o2) -> {
					if (!Objects.equals(o1.getLastname(), o2.getLastname()))
						return o1.getLastname().compareTo(o2.getLastname());
					else if (!Objects.equals(o1.getName(), o2.getName()))
						return o1.getName().compareTo(o2.getName());
					else return o1.getFatherName().compareTo(o2.getFatherName());
				}).collect(Collectors.toList());
	}

	public String printLastnames() {
		return students.stream()
				.map(Student::getLastname)
				.reduce((s1, s2) -> s1 + "-" + s2).orElse("-");
	}

	@Override
	public String toString() {
		String result = "";
		for (final Student student : students) {
			result += "Student { " + "name: " + student.getName() +
					", lastname: " + student.getLastname();
			for (final Subject subject : student.getSubject()) {
				result += ", subject: " + subject.getNameSubject() + "{ ";
				for (final Integer txt : student.getMarks().get(student.getSubject().indexOf(subject)).getMark())
					result += txt + " ";
				result += "}";
			}
			result += " }" + '\n';
		}
		return result;
	}
}

