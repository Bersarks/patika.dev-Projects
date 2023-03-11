// See https://aka.ms/new-console-template for more information .Net 6 dan itibaren bu şekilde oluştutuluyor.

int deger;

/* string degisken = NULL;
deger = 2;
string Degisken = NULL;
string degisken_veri= NULL; */
String degisken = " ";
if(degisken == " "){
	Console.WriteLine("Degisken boş");
}
else{
	Console.WriteLine("Degisken dolu");
}
/* byte b = 2; // 1 byte
sbyte sb = 2; // 1 byte
short s = 2; // 2 byte
ushort us = 1; // 2 byte
int i = 5; // 4 byte
Int32 i32 = 1; // 4 byte
Int64 i64 = 2323; // 8 byte
uint ui = 123; // 4 byte
long l = 65; // 8 byte
ulong ul = 2; // 8 byte
float f = 3; // 4 byte
double d = 5; // 8 byte
decimal m = 9; // 16 byte
bool bo = true; // 1 byte
bool bo1 = false; // 1 byte

char c = '2'; // 2 byte
string str = "2"; // sınırsız */

DateTime dt = DateTime.Now;

Console.WriteLine("Hello, World! " + dt);

object o1 = "x";
object o2 = "y";
object o3 = 4;
object o4 = 4.3;

// String Tanımlamalar
string str1 = string.Empty;
string str2 = " ";
string str3 = "asdasd";
string str4 = "asdasd";
string total = str1 + str2 + str3 + str4;

//integer tanımlamalar

int int1 = 5;
int int2 = 3;
int int3 = int1 * int2;

// boolean tanımlamalar

bool bool1 = 10 < 2;

// Değişken Dönüşümleri

string str20 = "20";
int int20 = 20;

string yeniDeger = str20 + int20.ToString();
Console.WriteLine(yeniDeger); // 2020

int int21 = int20 + Convert.ToInt32(str20);
Console.WriteLine(int21); // 40

int int22 = int20 + int.Parse(str20); // Çıktısı 40

//datetime

string datetime = DateTime.Now.ToString("dd/MM/yyyy");
Console.WriteLine(datetime);

string hour = DateTime.Now.ToString("HH:mm");
Console.WriteLine(hour);
