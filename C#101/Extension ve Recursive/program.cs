string	str = "Lorem ipsum dolor sit.";
int[]	src = {3, 5, 2, 6, 8, 1, 0, 4, 7, 9};

Console.WriteLine(str.CheckSpaces());				//String
Console.WriteLine(str.RemoveWhiteSpaces());			//******
Console.WriteLine(str.MakeUpperCase());				//******
Console.WriteLine(str.MakeLowerCase());				//String

Console.WriteLine("*********************************************");

src.IntSort();										//Int
src.PrintInt();										//Int

Console.WriteLine("*********************************************");

Transactions newTransactions = new();				//Recursive
Console.WriteLine(newTransactions.ExpoNum(10, 5));	//Recursive

public static class Extension{
	public static bool CheckSpaces(this string param)
	{
		return (param.Contains(" "));
	}
	
	public static string RemoveWhiteSpaces(this string param)
	{
		string[] newStr = param.Split(" ");
		return (string.Join("*", newStr));
	}

	public static string MakeUpperCase(this string param)
	{
		return (param.ToUpper());
	}

	public static string MakeLowerCase(this string param)
	{
		return (param.ToLower());
	}

	public static int[] IntSort(this int[] param)
	{
		Array.Sort(param);
		return (param);
	}

	public static void PrintInt(this int[] param)
	{
		foreach (var item in param)
			Console.WriteLine(item);
	}
}

public class Transactions
{
	public int ExpoNum(int basenum, int exponent) 		//Recursive function
	{
		if (exponent < 2)
			return (basenum);
		return (ExpoNum(basenum, exponent - 1) * basenum);
	}
}
