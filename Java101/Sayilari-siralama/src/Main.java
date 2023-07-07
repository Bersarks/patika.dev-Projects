import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i,j,k;

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		i = scn.nextInt();
		System.out.print("Enter the second number: ");
		j = scn.nextInt();
		System.out.print("Enter the third number: ");
		k = scn.nextInt();
		if (i > j && i > k) {
			if (j > k)
				System.out.println("The descending order is: " + i + " " + j + " " + k);
			else
				System.out.println("The descending order is: " + i + " " + k + " " + j);
		}
		if (j > i && j > k){
			if (i > k)
				System.out.println("The descending order is: " + j + " " + i + " " + k);
			else
				System.out.println("The descending order is: " + j + " " + k + " " + i);
		}
		if (k > i && k > j){
			if (i > j)
				System.out.println("The descending order is: " + k + " " + i + " " + j);
			else
				System.out.println("The descending order is: " + k + " " + j + " " + i);
		}
	}
}