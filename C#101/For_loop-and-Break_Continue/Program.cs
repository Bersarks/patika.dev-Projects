// See https://aka.ms/new-console-template for more information
for (int i = 0; i < 50; i++)
{
	Console.WriteLine("Number: "+ i);
}

int	oddNumber = 0;
int	evenNumber = 0;

for (int i = 0; i <= 1000; i++)
{
	if (i % 2 == 0 && i % 3 == 0)
		continue;
	else if (i % 2 == 0)
		evenNumber += i;
	else
		oddNumber += i;
}
Console.WriteLine("Sum of odd numbers: "+ oddNumber);
Console.WriteLine("Sum of even numbers: "+ evenNumber);

for (int i = 0; i < 20; i++)
{
	if (i == 3)
		break;
	Console.WriteLine(i);
}

for (int i = 0; i < 20; i++)
{
	if (i == 3)
		continue;
	Console.WriteLine(i);
}
