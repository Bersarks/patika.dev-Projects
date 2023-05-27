import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        double boy, kilo, index;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = scn.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo = scn.nextDouble();
        index = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz:" + index);
    }
}