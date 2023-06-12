import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int set, first, second, sum;
		set = 0;
		System.out.printf("Hesap Makinası Programına Hoş Geldiniz!\n");
		while(set < 5)
		{
			System.out.println("Yapmak istediğiniz işlemi seçiniz.\nToplama işlemi için:\"1\""
					+ "\nÇıkartma işlemi için: \"2\"\nÇarpma işlemi için: \"3\"\nBölme işlemi için: \"4\"\nÇıkmak için:\"5\"");
			Scanner scn = new Scanner(System.in);
			set = scn.nextInt();
			if (set == 5)
				break;
			System.out.print("Birinci sayıyı giriniz:");
			first = scn.nextInt();
			System.out.print("İkinci sayıyı giriniz:");
			second = scn.nextInt();
			switch (set) {
				case 1:
					sum = first + second;
					System.out.println("Toplama işlemi sonucu: " + sum);
					break;
				case 2:
					sum = first - second;
					System.out.println("Çıkartma işlemi sonucu: " + sum);
					break;
				case 3:
					sum = first * second;
					System.out.println("Çarpma işlemi sonucu: " + sum);
					break;
				case 4:
					sum = first / second;
					System.out.println("Bölme işlemi sonucu: " + sum);
					break;
				default:
					throw new IllegalStateException("Unexpected value: " + set);
			}
		}
	}
}
