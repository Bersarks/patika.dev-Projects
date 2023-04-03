/*
1-) Bir konsol uygulamasında kullanıcıdan pozitif bir sayı girmesini isteyin(n). Sonrasında kullanıcıdan n adet pozitif sayı girmesini isteyin. Kullanıcının girmiş olduğu sayılardan çift olanlar console'a yazdırın.
*/
using System.Collections;

int x, n;
ArrayList	newArr = new ArrayList();

try
{
	Console.Write("Kaç adet sayı yazmak istediğinizi girin(Pozitif olmalı): ");
	n = Convert.ToInt32(Console.ReadLine());
	if (n > 0)
	{
		for (int i = 1; i <= n; i++)
		{
			Console.Write("{0}. değeri giriniz(Pozitif olmalı): ", i);
			x = Convert.ToInt32(Console.ReadLine());
			if (x <= 0)
				break;
			if (x % 2 == 0 && x != 0)
				newArr.Add(x);
		}
		foreach (var item in newArr)
		{
			Console.WriteLine(item);
		}
	}
	else
		Console.WriteLine("Girilen sayı pozitif bir sayı olmalıdır!");
}
catch (Exception ex)
{
	Console.WriteLine("hatalı veri girişi! " + ex.Message);
}
