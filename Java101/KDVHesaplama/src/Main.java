/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18, tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int price;
        double total;

        System.out.print("Fiyat giriniz:");
        price = scn.nextInt();

        total = price <= 1000 ? price + (((double)price / 100) * 18) : price + (((double)price / 100) * 8);
        System.out.print("KDV'li fiyat: " + total);



    }
}