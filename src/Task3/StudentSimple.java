package Task3;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSimple {
	private long id;
	private String name;
	private String Lastname;

	public StudentSimple() {
	}

	public StudentSimple(final Student students) {
		this.name = students.getName();
		this.Lastname = students.getLastname();
		this.id = students.getId();
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(final String Lastname) {
		this.Lastname = Lastname;
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public List<StudentSimple> transformationList(final List<Student> students) {
		return students.stream()
				.map(StudentSimple::new)
				.collect(Collectors.toList());
	}

}

