package model;

import model.Teacher;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;
	int sozluNote;

	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
	}

	public void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
			/*System.out.println(teacher.name + " başarılı bir şekilde derse atandı.");*/
		} else {
			System.out.println("Öğretmen ve ders bölümleri uyuşmuyor !");
		}
	}

	@Override
	public String toString() {
		return "Course{" +
				"teacher=" + teacher +
				", name='" + name + '\'' +
				", code='" + code + '\'' +
				", prefix='" + prefix + '\'' +
				", note=" + note +
				", sozluNote=" + sozluNote +
				'}';
	}
}
