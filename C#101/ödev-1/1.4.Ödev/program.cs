/*
4-) Bir konsol uygulamasında kullanıcıdan bir cümle yazmasını isteyin.
Cümledeki toplam kelime ve harf sayısını console'a yazdırın.
*/
using System.Collections;


Console.Write("Bir cümle giriniz: ");
string	str = Console.ReadLine();

char[]	sep = {',', ' '};
string[] arr = str.Split(sep, StringSplitOptions.RemoveEmptyEntries);

foreach (var item in arr)
{
	Console.WriteLine(item);
}

Console.WriteLine("Kelime Sayısı: "+ arr.Length);

Console.WriteLine("Harf Sayısı: "+ str.RemoveWhiteSpaces().Length);

public static class Extension
{
	public static string RemoveWhiteSpaces(this string str)
	{
		string[] newStr = str.Split(' ', ',');
		return (string.Join("", newStr));
	}
}
