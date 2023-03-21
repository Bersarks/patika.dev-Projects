// See https://aka.ms/new-console-template for more information
int	time = DateTime.Now.Hour;

if (time >= 6 && time <= 11)
	Console.WriteLine("Good morning!");
else if (time <= 18)
	Console.WriteLine("Have a nice day!");
else
	Console.WriteLine("Good Night");

string result = time <= 18 ? "Have a nice day!" : "Good night";
Console.WriteLine(result);

result = time >= 6 && time <= 11 ? "Good morning!" : time <= 18 ? "Have a nice day!" : "Good night";
Console.WriteLine(result);
