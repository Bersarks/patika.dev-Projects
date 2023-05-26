/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        double     i,j,k,x,a;

        System.out.print("Dik üçgenin birinci kenarını giriniz:");
        i = scn.nextInt();
        System.out.print("Dik üçgenin ikinci kenarını giriniz:");
        j = scn.nextInt();
        k = Math.sqrt((i * i) + (j * j));
        x = (i+j+k) / 2;
        a = x * (x - i) * (x - j) * (x - k);
        System.out.println("Dik üçgenin hipotenüsü:" + k + "\nDik üçgenin alanı:" + a);
    }
}
