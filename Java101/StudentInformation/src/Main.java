import model.Course;
import model.Student;
import model.Teacher;

public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "905000000");
		Teacher t2 = new Teacher("Graham Bell", "FZK", "00000");
		Teacher t3 = new Teacher("Külyutmaz", "BIO", "111");

		Course history = new Course("Tarih", "101", "TRH");
		history.addTeacher(t1);

		Course pyshics = new Course("Fizik", "102", "FZK");
		pyshics.addTeacher(t2);

		Course biology = new Course("Biyoloji", "101", "BIO");
		biology.addTeacher(t3);

		Student s1 = new Student("İnek Şaban", "123", "4", history, pyshics, biology);
		s1.addBulkExamNote(100,78,50, 40, 50, 80);
		s1.printNote();

		s1.isPass();

		Student s2 = new Student("Güdük Necmi", "444", "4", history, pyshics, biology);
		s2.addBulkExamNote(50, 30, 70, 25, 100, 75);
		s2.printNote();
		s2.isPass();
	}
}