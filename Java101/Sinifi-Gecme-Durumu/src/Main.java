import java.util.Scanner;

/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev:
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

*/
public class Main {
	public static void main(String[] args) {
		int math, physics, turkish, history, music, chemistry;

		Scanner scn = new Scanner(System.in);

		System.out.println("Matematik notunuzu giriniz: ");
		math = scn.nextInt();

		System.out.println("Fizik notunuzu giriniz: ");
		physics = scn.nextInt();

		System.out.println("Türkçe notunuzu giriniz: ");
		turkish = scn.nextInt();

		System.out.println("Tarih notunuzu giriniz: ");
		history = scn.nextInt();

		System.out.println("Müzik notunuzu giriniz: ");
		music = scn.nextInt();
		if (math < 0 || math > 100) {
			math = 0;
		}
		if (physics < 0 || physics > 100) {
			physics = 0;
		}
		if (turkish < 0 || turkish > 100) {
			turkish = 0;
		}
		if (history < 0 || history > 100) {
			history = 0;
		}
		if (music < 0 || music > 100) {
			music = 0;
		}
		double average = (math + physics + turkish + history + music) / 5.0;
		System.out.println("Ortalamanız: " + average);
		if (average < 55) {
			System.out.println("Sınıfta kaldınız.");
		} else {
			System.out.println("Tebrikler, sınıfı geçtiniz.");
		}
	}
}