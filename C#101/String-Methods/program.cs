string variable1 = "Dersimiz CSharp,Hoş Geldiniz!";
string variable2 = "CSharp";

//Length
Console.WriteLine(variable1.Length); //29

//TooUpper, ToLower
Console.WriteLine(variable1.ToUpper()); //DERSIMIZ CSHARP,HOŞ GELDİNİZ!
Console.WriteLine(variable2.ToLower()); //csharp

//Concat
Console.WriteLine(String.Concat(variable1, " Hello!")); //Dersimiz CSharp,Hoş Geldiniz! Hello!

//Compare, CompareTo
Console.WriteLine(String.Compare(variable1, variable2, true)); //1
Console.WriteLine(String.Compare(variable1, variable2, false)); //0
Console.WriteLine(variable1.CompareTo(variable2)); //1

//Contains
Console.WriteLine(variable1.Contains(variable2)); //true
Console.WriteLine(variable1.StartsWith("Welcome")); //false
Console.WriteLine(variable1.EndsWith("Hello!")); //false

//IndexOf
Console.WriteLine(variable1.IndexOf("CS")); //10
Console.WriteLine(variable1.IndexOf("C#")); //-1
Console.WriteLine(variable1.LastIndexOf("W")); //25

//Insert
Console.WriteLine(variable1.Insert(0, "Hello! ")); //Hello! Dersimiz CSharp,Hoş Geldiniz!

//PadLeft, PadRight
Console.WriteLine(variable1 + variable2.PadLeft(30)); 
Console.WriteLine(variable1 + variable2.PadLeft(30, '*')); 
Console.WriteLine(variable1.PadRight(50) + variable2); 
Console.WriteLine(variable1.PadRight(50, '_') + variable2.PadLeft(30, '-')); 

//Remove
Console.WriteLine(variable1.Remove(10)); //Dersimiz
Console.WriteLine(variable1.Remove(5, 3)); //Dersiz CSharp,Hoş Geldiniz!
Console.WriteLine(variable1.Remove(0, 1)); //ersimiz CSharp,Hoş Geldiniz!

//Replace
Console.WriteLine(variable1.Replace("CSharp", "C#")); //Dersimiz C#,Hoş Geldiniz!
Console.WriteLine(variable1.Replace(" ", "*")); //Dersimiz*CSharp,Hoş*Geldiniz!

//Split
Console.WriteLine(variable1.Replace(",", "").Split(' ')[3]); //CSharp

//Substring
Console.WriteLine(variable1.Substring(2)); //rsimiz CSharp,Hoş Geldiniz!
Console.WriteLine(variable1.Substring(4, 6)); //imiz C
