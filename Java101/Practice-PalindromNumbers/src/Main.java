public class Main {

	static boolean isPalindrom(int number){
		int temp = number;
		int reverse = 0;
		while (temp != 0){
			int lastDigit = temp % 10;
			reverse = (reverse * 10) + lastDigit;
			temp /= 10;
		}
		if (number == reverse){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrom(12321));
	}
}