package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	static long idStatic = 0;
	private long id;
	private String name;
	private String Lastname;
	private String fatherName;
	private List<Subject> subject;
	private List<Grade> grades;

	public Student(final String fatherName) {}

	public Student(final String name, final String surName, final String fatherName) {
		this.name = name;
		this.Lastname = Lastname;
		this.fatherName = fatherName;
		this.grades = setGradeSubject();
		this.id = Student.idStatic++;
	}

	public Student(final String name, final String Lastname, final String fatherName, final List<Subject> subject) {
		this.name = name;
		this.Lastname = Lastname;
		this.fatherName = fatherName;
		this.subject = subject;
		this.grades = setGradeSubject();
		this.id = Student.idStatic++;
	}

	public static long getIdStatic() {
		return idStatic;
	}

	public static void setIdStatic(final long idStatic) {
		Student.idStatic = idStatic;
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(final List<Subject> subject) {
		this.subject = subject;
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

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(final String fatherName) {
		this.fatherName = fatherName;
	}

	public void addGrade(final int value, final String nameSubject) {
		for (int i = 0; i < subject.size(); i++) {
			if (subject.get(i).getNameSubject() == nameSubject) {
				if (value > 12 || value < 0)
					grades.get(i).getGrade().add(12);
				else
					grades.get(i).getGrade().add(value);
			}
		}
	}

	private List<Grade> setGradeSubject() {
		final List<Grade> grades = new ArrayList<>();

		for (int i = 0; i < subject.size(); i++) {
			final Grade grade = new Grade();
			grades.add(grade);
		}
		return grades;
	}

	public double averageMark() {
		double tmp = 0;
		int count = 0;

		for (final Grade grade : grades) {
			tmp += grade.getGrade().stream().mapToInt(value -> value).sum();
			count += grade.getGrade().stream().mapToInt(value -> value).count();
		}
		if(count != 0)
			return tmp/count;
		else
			return 0;
	}

	public List<Integer> printMarkEnglish() {  // змінити!
		for (int i = 0; i < subject.size(); i++) {
			if (subject.get(i).getNameSubject().equals("English")) {
				return grades.get(i).getGrade().stream().distinct().collect(Collectors.toList());
			}
		}
		return new ArrayList<>();
	}

	@Override
	public String toString() {
		return "id = " + this.getId() + " Name = " + this.getName() +	" Surname = " + this.getLastname() + " FatherName = " + this.getFatherName();
	}
}

