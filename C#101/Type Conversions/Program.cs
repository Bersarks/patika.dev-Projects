// See https://aka.ms/new-console-template for more information
		Console.WriteLine("***********Implicit Conversion (Bilinçsiz dönüşüm)***********");

			byte	a = 1;
			sbyte	b = 2;
			short	c = 3;

			int		d = a + b + c;
			Console.WriteLine("d = " + d); // d = 6

			long	e = d;
			Console.WriteLine("e = " + e); // e = 6

			float	f = e;
			Console.WriteLine("f = " + f); // f = 6

			string	g = "Lorem, ipsum dolor";
			char	h = '.';

			object	i = g + h + d;
			Console.WriteLine("i = " + i); // i = Lorem, ipsum dolor.6

	//Bir değişkenin kendinden daha yüksek kapasiteli bir değişkene atanmasıdır. Hedef değişkenin veri tipi bellekte yeterli alana sahip olacağından, bu dönüşümde bir veri kaybı söz konusu olmayacaktır. Dolayısıyla bu dönüşüm kendiliğinden yapılabilir.




	// Explicit Conversion (Bilinçli dönüşüm)
			Console.WriteLine("***********Explicit Conversion (Bilinçli dönüşüm)***********");

			int		j = 10;
			byte	k = (byte)j;
			Console.WriteLine("k = " + k); // k = 10

			int		l = 100;
			byte	m = (byte)l;
			Console.WriteLine("k = " + m); // m = 100

			float	n = 10.14f;
			byte	o = (byte)n;
			Console.WriteLine("o = " + o); // o = 10

	/* .ToString() Metodu */
			Console.WriteLine("***********.ToString() Metodu***********");

			int		p = 10;
			string	q = p.ToString();
			Console.WriteLine("q = " + q); // q = "10"

			string	r = 17.23f.ToString();
			Console.WriteLine("r = " + r); // r = "17,23"

	// System.Conver Sınıfı
			Console.WriteLine("***********System.Convert Sınıfı***********");

			string	s;
			string	t;
			int		u;
			int		v;
			int		w;

			s = "10";
			t = "20";
			u = Convert.ToInt32(s);
			v = Convert.ToInt32(t);
			w = u + v;
			Console.WriteLine("w = " + w); // w = 40;

	// Parse
			Console.WriteLine("***********Parse Kullanımı***********");

			string	x;
			string	y;
			int		z;
			double	aa;

			x = "10";
			y = "10,23";

			z = Int32.Parse(x);
			aa = Double.Parse(y);

			Console.WriteLine("z = " + z); // z = 10;
			Console.WriteLine("aa = " + aa); // aa = 10,23;
