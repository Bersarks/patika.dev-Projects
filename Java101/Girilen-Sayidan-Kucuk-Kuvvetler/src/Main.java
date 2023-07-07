/*
Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] str) {
		int i = 1, n, j = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = scn.nextInt();
		System.out.println("4^" + j + " = " + i);
		j++;
		i = i * 4;
		while (i < n) {
			System.out.println("4^" + j + " = " + i);
			j++;
			i = i * 4;
		}
		j = 0;
		i = 1;
		System.out.println("5^" + j + " = " + i);
		j++;
		i = i * 5;
		while (i < n) {
			System.out.println("5^" + j + " = " + i);
			j++;
			i = i * 5;
		}
	}
}
