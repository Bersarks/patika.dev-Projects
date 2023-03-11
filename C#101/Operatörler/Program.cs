// See https://aka.ms/new-console-template for more information
//Atama ve işlemli atama
			Console.WriteLine("**********Atama ve İşlemli Atama Operatörler**********");
            int	y = 3;

			Console.WriteLine(y);
			y += 2;
			Console.WriteLine(y);
			y /= 1;
			Console.WriteLine(y);
			y *= 2;
			Console.WriteLine(y);
			y -= 2;
			Console.WriteLine(y);

			Console.WriteLine("***************************************");
			//Mantıksal Operatörler
			// &&, ||, !
			Console.WriteLine("**********Mantıksal Operatörler**********");

			bool isSuccess = true;
			bool isUnsuccessful = false;

			if (isSuccess && isUnsuccessful)
				Console.WriteLine("Perfect");
			if (isSuccess || isUnsuccessful)
				Console.WriteLine("Great");
			if (isSuccess && !isUnsuccessful)
				Console.WriteLine("Fine!");

			Console.WriteLine("***************************************");

			//İlişkisel Operatörler
			// <, >, <=, >=, !=, ==
			Console.WriteLine("**********İlişkisel Operatörler**********");

			int		a = 3, b = 7;
			bool	result = a < b;

			Console.WriteLine(result);
			result = a > b;
			Console.WriteLine(result);
			result = a <= b;
			Console.WriteLine(result);
			result = a >= b;
			Console.WriteLine(result);
			result = a != b;
			Console.WriteLine(result);
			result = a == b;
			Console.WriteLine(result);

			Console.WriteLine("***************************************");

			//Aritmatiksel Operatörler
			// +, -, *, /, ++, --, %
			Console.WriteLine("**********Aritmatiksel Operatörler**********");

			int		num = 3;

			Console.WriteLine(num);
			num = num + 7;
			Console.WriteLine(num);
			num = num - 2;
			Console.WriteLine(num);
			num = num * 2;
			Console.WriteLine(num);
			num = num / 2;
			Console.WriteLine(num);
			num++;
			Console.WriteLine(num);
			num--;
			Console.WriteLine(num);
			num = num % 2;
			Console.WriteLine(num);
