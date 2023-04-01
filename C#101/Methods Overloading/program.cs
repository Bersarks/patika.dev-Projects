Methods newMethods = new Methods();

int	x = 12;
int y = 21;
int total;
string num = "123";
bool truefalse;

truefalse = int.TryParse(num, out int res);
if (truefalse)
{
	Console.WriteLine("TOTAL:");
	newMethods.addition(x, y, out total);
	newMethods.print(total);
	Console.WriteLine("RES:");
	newMethods.print(res);
}
else
	newMethods.print("Operation failed!");
newMethods.print(num);
newMethods.print(x, y);

class Methods
{
	public void addition(int num1, int num2, out int total) //Out Parameter
	{
		total = num1 + num2;
	}
	public void print(string str) //Overloading-1
	{
		Console.WriteLine(str);
	}
	public void print(int str) //Overloading-2
	{
		Console.WriteLine(str);
	}
	public void print(int num1, int num2) //Overloading-3
	{
		Console.WriteLine(num1 + num2);
	}
}
