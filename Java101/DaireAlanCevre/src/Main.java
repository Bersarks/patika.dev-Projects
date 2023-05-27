import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        double alan, alan2, cevre, pi = 3.14, yariCap, merkezAci;

        System.out.print("Dairenin yarı çapını giriniz:");
        yariCap = scn.nextInt();
        System.out.print("Dairenin merkez açısını giriniz:");
        merkezAci = scn.nextInt();
        alan = yariCap * yariCap * pi;
        cevre = 2 * pi * yariCap;
        System.out.println("Dairenin alanı:" + alan + " Dairenin çevresi:" + cevre);
        alan2 = (pi * (yariCap * yariCap) * merkezAci) / 360;
        System.out.println("Merkez açısı ölçüsü:" + (int)merkezAci + " olan daire dilimi alanı:" + alan2);
    }
}