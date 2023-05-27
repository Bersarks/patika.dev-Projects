import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double start = 10, km, min = 20, total;
        Scanner scn = new Scanner(System.in);

        System.out.print("Taksi ile gitmek istediğiniz mesafeyi giriniz(KM olarak):");
        km = scn.nextInt();
        start += km * 2.20;
        total = start < min ? min : start;
        System.out.println("Ödemeniz gereken tutar:" + total);
    }
}