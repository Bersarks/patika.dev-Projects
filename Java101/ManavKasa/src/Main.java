import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00, total;
		int count;
		System.out.print("Armut Kaç Kilo? :");
		count = scn.nextInt();
		total = count * pear;
		System.out.print("Elma Kaç Kilo? :");
		count = scn.nextInt();
		total += count * apple;
		System.out.print("Domates Kaç Kilo? :");
		count = scn.nextInt();
		total += count * tomato;
		System.out.print("Muz Kaç Kilo? :");
		count = scn.nextInt();
		total += count * banana;
		System.out.print("Patlıcan Kaç Kilo? :");
		count = scn.nextInt();
		total += count * eggplant;
		System.out.println("Toplam tutar:" + total + "TL");
	}
}