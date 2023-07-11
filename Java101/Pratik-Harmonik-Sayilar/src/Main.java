import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scn.nextInt();
		double result = 0.0;
		for (int i = 1; i <= num; i++) {
			result += 1.0 / i;
		}
		System.out.println(result);
	}
}