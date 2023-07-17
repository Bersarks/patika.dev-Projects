public class Main {
	static int recursiveFibonacci(int number){
		if (number == 0 || number == 1) {
			return number;
		} else {
			return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
		}
	}
	public static void main(String[] args) {
		System.out.println(recursiveFibonacci(6));
	}
}