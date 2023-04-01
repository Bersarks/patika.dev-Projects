// See https://aka.ms/new-console-template for more information .Net 6 dan itibaren bu şekilde oluştutuluyor.
int[]	newArr = {15, 23, 34, 42, 51, 46, 33, 22, 1, 34, 4};

foreach (var num in newArr)
	Console.WriteLine(num);

Console.WriteLine("*******************Array.Sorted******************");
Array.Sort(newArr);

foreach (var num in newArr)
	Console.WriteLine(num);

Console.WriteLine("*******************Array.Clear******************");
Array.Clear(newArr,2,2);
//Dizi elemanlarını kullanarak 2. indexten itibaren 2 tane elemanı 0 lar.

foreach (var num in newArr)
	Console.WriteLine(num);

Console.WriteLine("*******************Array.Reverse******************");
Array.Reverse(newArr);

foreach (var num in newArr)
	Console.WriteLine(num);

Console.WriteLine("*******************Index Of******************");
Console.WriteLine(Array.IndexOf(newArr, 51));

Console.WriteLine("*******************Array.Resize******************");
Array.Resize<int>(ref newArr,12);
newArr[11] = 5;

foreach (var num in newArr)
	Console.WriteLine(num);
