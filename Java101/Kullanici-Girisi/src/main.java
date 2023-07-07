import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		String userName, password, reset, newPassword;

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter your username: ");
		userName = scn.nextLine();

		System.out.println("Enter your password: ");
		password = scn.nextLine();

		if (userName.equals("admin") && password.equals("admin")) {
			System.out.println("Welcome " + userName);
		} else {
			System.out.println("Invalid username or password");
			System.out.println("Do you want to reset your password? (y/n)");
			reset = scn.nextLine();
			if (reset.equals("y")) {
				System.out.println("Enter your new password: ");
				newPassword = scn.nextLine();
				if (newPassword.equals(password)) {
					System.out.println("Your new password cannot be the same as your old password");
				} else {
					password = newPassword;
					System.out.println("Your password has been reset");
				}
			} else {
				System.out.println("Your password has not been reset");
			}
			System.out.println("Exiting program");
		}
	}
}
