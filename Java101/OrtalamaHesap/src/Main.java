/*
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int total, fizik, kimya, matematik, tarih, muzik, turkce;
        String gecme;

        System.out.println("Not ortalaması hesaplama programına hoş geldiniz. Lütfen sadece sayı girişi yapınız.");
        System.out.print("Matematik notunuzu giriniz:");
        matematik = scn.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = scn.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = scn.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = scn.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = scn.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = scn.nextInt();

        total = (matematik + muzik + fizik + tarih + kimya+ turkce) / 6;
        gecme = total > 60 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
        System.out.println(gecme + " Not ortalamanız:" + total);
    }
}