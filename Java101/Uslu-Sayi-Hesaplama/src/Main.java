/*
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int base, exponent, result = 1;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter base: ");
		base = scn.nextInt();
		System.out.print("Enter exponent: ");
		exponent = scn.nextInt();
		for(int i = 0; i < exponent; i++) {
			result *= base;
		}
		System.out.println("Result: " + result);
	}
}