
/*3-) Bir konsol uygulamasında kullanıcıdan pozitif bir sayı girmesini isteyin (n).
//Sonrasında kullanıcıdan n adet kelime girmesi isteyin.
Kullanıcının girişini yaptığı kelimeleri sondan başa doğru console'a yazdırın.*/

using System.Collections;

int	n;

try
{
	Console.Write("Pozitif bir tam sayı giriniz: ");
	n = Convert.ToInt32(Console.ReadLine());
	string[]	m = new string[n];

	if (n > 0)
	{
		for (int i = 0; i < n; i++)
		{
			m[i] = Console.ReadLine();
		}
		Array.Reverse(m);
		foreach (var item in m)
		{
			Console.WriteLine(item);
		}
	}
	else
		Console.WriteLine("Girilen sayı pozitif bir tam sayı olmalıdır!");
}
catch(Exception ex)
{
	Console.WriteLine("Hatalı veri girişi! " + ex.Message);
}
