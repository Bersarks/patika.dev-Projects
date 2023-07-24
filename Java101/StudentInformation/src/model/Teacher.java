package model;

public class Teacher {
	String name;
	String mpno;
	String branch;

	public Teacher(String name, String branch, String mpno) {
		this.name = name;
		this.branch = branch;
		this.mpno = mpno;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				", mpno='" + mpno + '\'' +
				", branch='" + branch + '\'' +
				'}';
	}
}
