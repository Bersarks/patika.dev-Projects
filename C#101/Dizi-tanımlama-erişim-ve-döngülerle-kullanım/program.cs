// See https://aka.ms/new-console-template for more information
string[] color = new string[4];
string[] animals = {"Cat", "Dog", "Horse", "Monkey", "Bird"};
int[] number;

number = new int[5];

color[0] = "black";
number[3] = 53;

Console.WriteLine(color[0]);
Console.WriteLine(animals[1]);
Console.WriteLine(number[3]);


Console.Write("Enter the size of the directory to be created: ");
int	arrLength = int.Parse(Console.ReadLine());
int[]	numArray = new int[arrLength];

for (int i = 0; i < arrLength; i++)
{
	Console.WriteLine("Enter the {0}st number", i+1);
	numArray[i] = int.Parse(Console.ReadLine());
}

int	tot = 0;
foreach (var average in numArray)
	tot += average;
Console.WriteLine("Average: "+ tot/arrLength);
