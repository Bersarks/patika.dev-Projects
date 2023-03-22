// See https://aka.ms/new-console-template for more information
int	value, count, total;

value = int.Parse(Console.ReadLine());
count = 1;
total = 0;
while (count <= value)
{
	total += count;
	count++;
}
Console.WriteLine("Average: "+ total/value);

char	alphabet;

alphabet = 'a';
while (alphabet <= 'z')
{
	Console.WriteLine("Alphabet: "+ alphabet);
	alphabet++;
}

Console.WriteLine("************ForEach************");
int[]	numericArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
foreach (var number in numericArray)
{
	Console.WriteLine("Array index value: "+ number);
}
