package Task3;

import java.util.List;
import java.util.ArrayList;

public class Grade {
	public List<Integer> grade = new ArrayList<>();

	public Grade(final List<Integer> list) {
		this.grade = list;
	}

	public Grade() {}

	public List<Integer> getGrade() {
		return grade;
	}

	public void setGrade(final List<Integer> grade) {
		this.grade = grade;
	}

}

