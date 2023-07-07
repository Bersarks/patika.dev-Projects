/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number, count = 1, sum = 0, numberCount = 0; // I don't want to add 0 to divisible group. So I start count from 1.
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = scn.nextInt();
		System.out.println("The numbers are divisible by 3 and 4:");
		while (count <= number) {
			if (count % 3 == 0 && count % 4 == 0) {
				System.out.println(count);
				sum += count;
				numberCount++;
			}
			count++;
		}
		System.out.println("The average of the numbers is: " + (sum / numberCount));
	}
}