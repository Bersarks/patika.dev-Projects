/* erisim_belirteci geri_dönüs_tipi metot_ismi(parametreler)
{
	// kodlar
} */

Methods	obj = new Methods();

int	x = 12;
int	y = 21;

Console.WriteLine(x + y);
Console.WriteLine(addition(x, y));
obj.print(Convert.ToString(x + y));
obj.print(Convert.ToString(obj.increaseAndCollect(ref x, ref y)));
obj.print(Convert.ToString(x + y));

static int addition(int x, int y)
{
	x++;
	y++;
	return (x + y);
}

class Methods
{
	public void print(string str)
	{
		Console.WriteLine(str);
	}

	public int increaseAndCollect(ref int x, ref int y)
	{
		x++;
		y++;
		return (x + y);
	}
}
