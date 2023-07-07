/*
Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number = 1, sum = 0;
		Scanner scn = new Scanner(System.in);
		do {
			System.out.println("Enter a number: ");
			number = scn.nextInt();
			if (number % 2 == 0 && number % 4 == 0) {
				sum += number;
			}
		}while (number % 2 == 0);
		System.out.println("Sum of even and multiples of 4: " + sum);
	}
}