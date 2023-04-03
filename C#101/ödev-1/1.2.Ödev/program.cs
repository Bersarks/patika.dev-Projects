/*
2-) Bir konsol uygulamasında kullanıcıdan pozitif iki sayı girmesini isteyin (n, m).
Sonrasında kullanıcıdan n adet pozitif sayı girmesini isteyin.
Kullanıcının girmiş olduğu sayılardan m'e eşit yada tam bölünenleri console'a yazdırın.
*/
using System.Collections;

int			a, b, c;
ArrayList	newArr = new ArrayList();

try
{
	Console.Write("Girmek istediğiniz sayı adedini yazın(Pozitif Sayı Olmalı!): ");
	a = Convert.ToInt32(Console.ReadLine());
	Console.Write("Sabit değerinizi yazın(Pozitif Sayı Olmalı!): ");
	b = Convert.ToInt32(Console.ReadLine());

	if (a > 0 && b > 0)
	{
		for (int i = 1; i <= n; i++)
		{
			Console.Write("{0}. değeri gir: ", i);
			c = Convert.ToInt32(Console.ReadLine());
			if (c <= 0)
				break;
			if ((c % m == 0 && c != 0) || c == m)
				newArr.Add(c);
		}
		foreach (var item in newArr)
		{
			Console.WriteLine(item);
		}
	}
	else
		Console.WriteLine("Girilen sayılar pozitif bir sayı olmalıdır!");
}
catch (Exception ex)
{
	Console.WriteLine("Hatalı veri girişi! "+ ex.Message);
}
