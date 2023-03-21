// See https://aka.ms/new-console-template for more information
try
{	
	int	x;
	Console.WriteLine("Enter a number: ");
	x = Convert.ToInt32(Console.ReadLine());
	Console.WriteLine("Number: " + x);
}
catch (Exception ex){
	Console.WriteLine("Error: " + ex.Message);
}
finally
{
	Console.WriteLine("Completed!");
}

try
{
	//int	y;
	//int	z;
	int	f;

	//y = Int32.Parse("test");
	//z = Int32.Parse(null);
	f = Int32.Parse("-20000000000");
	//Console.WriteLine(y);
}
catch (FormatException ex)
{
	Console.WriteLine("Data type mismatch");
	Console.WriteLine("Error: " + ex.Message);
}
catch (ArgumentNullException ex)
{
	Console.WriteLine("Value cannot be null");
	Console.WriteLine("Error: " + ex.Message);
}
catch (OverflowException ex)
{
	Console.WriteLine("Data overflow with entered value");
	Console.WriteLine("Error: " + ex.Message);
}
finally
{
	Console.WriteLine("Code that will work even if there is an error");
}
