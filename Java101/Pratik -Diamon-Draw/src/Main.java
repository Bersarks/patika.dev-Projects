import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Üçgen boyutunu giriniz: ");
		int boyut = scn.nextInt();
		int count = 1;
		int stars = 1;
		int spaces = 0;
		while (count <= boyut) {
			while (spaces < boyut) {
				System.out.print(" ");
				spaces++;
			}
			while (stars <= count) {
				System.out.print("*");
				stars++;
			}
			stars--;
			while (stars > 1) {
				System.out.print("*");
				stars--;
			}
			System.out.println();
			spaces = count;
			count++;
		}
		while (count > 0) {
			spaces = boyut - count + 1;
			stars = count;
			while (spaces > 0) {
				System.out.print(" ");
				spaces--;
			}
			while (stars > 0) {
				System.out.print("*");
				stars--;
			}
			stars = count;
			while (stars > 1) {
				System.out.print("*");
				stars--;
			}
			System.out.println();
			count--;
		}
	}
}