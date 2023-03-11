# [22,27,16,2,18,6] --> Insertion Sort

* ### Yukarıda verilen dizinin Insertion Sort'a göre aşamalarını yazınız.

>İnsertion Sort'un olayı, ilk index'ten başlayıp kendinden sonra gelen index'in değerini karşılaştırıp küçük olanı değeri swap(takas) işlemiyle index'in başına taşır. Yukarıda ki diziye göre hareket edecek olursak aşağıda ki gibi bir yol izlenecektir.

![Insertion Sort GIF](https://i.stack.imgur.com/GrwKG.gif)

### NOT: İlk adımı yazmadım, ilk adımda olan şey kendini kontrol etmesi 22 - 22 durumu, bunu yazdığınız kodda yaptığınız işe göre değiştirebilirsiniz o yüzden 2.adım olarak başlattım.


>22 - 27 kıyaslamasında 22 yerinde kalır sonraki karşılaştırma da 27 - 16 arasındadır.

|2.Adım|22|27|16|2|18|6|
|------|- |- |- |-|- |-|

>27 - 16 kıyaslamasında 16 27'den küçük olduğu için 16 ve 27 yer değişir ve 22 - 16 kıyaslaması yapılır. Burada da yine 16 22'den küçük olduğu için en başta ki index'e yerleşir.

|3.Adım|22|27|16|2|18|6|-->|22|16|27|2|18|6|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

|3.Adım|22|16|27|2|18|6|-->|16|22|27|2|18|6|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

>Sıralama aynı şekilde devam eder ve bu sefer 27 - 2 karşılaştırması yapılır.
2 27'den küçüktür ve yer değişir, 2 22'den küçüktür ve yer değişir, 2 16'dan küçüktür ve yer değişir.

|4.Adım|16|22|27|2|18|6|-->|16|22|2|27|18|6|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

|4.Adım|16|22|2|27|18|6|-->|16|2|22|27|18|6|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

|4.Adım|16|2|22|27|18|6|-->|2|16|22|27|18|6|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

>27 - 18 kıyaslaması, 18 27'den küçüktür yer değişir, 18 22'den küçüktür yer değişir, 18 16'dan küçük olmadığı için bir sonra ki index'e geçilir.

|5.Adım|2|16|22|27|18|6|-->|2|16|22|18|27|6|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

|5.Adım|2|16|22|18|27|6|-->|2|16|18|22|27|6|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

>27 - 6 kıyaslaması, 6 27'den küçüktür yer değişir, 6 22'den küçüktür yer değişir, 6 18'den küçüktür yer değişir, 6 16'dan küçüktür yer değişir ve son olarak 6 2'den büyük olduğu için dizinin son hali Insertion Sort'a göre şu şekildedir. [2, 6, 16, 18, 22, 27]

|6.Adım|2|16|18|22|27|6|-->|2|16|18|22|6|27|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

|6.Adım|2|16|18|22|6|27|-->|2|16|18|6|22|27|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

|6.Adım|2|16|18|6|22|27|-->|2|16|6|18|22|27|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

|6.Adım|2|16|6|18|22|27|-->|2|6|16|18|22|27|
|------|- |- |- |-|- |-|---|- |- |- |-|- |-|

* ### Big-O gösterimini yazınız.

>O(<td>n<sup>2</sup></td>)


* ### Time Complexity:

>Bilgisayar biliminde zaman karmaşıklığı, bir algoritmanın çalışma süresini gösteren ifadedir. Zaman karmaşıklığı bir algoritma analizi yöntemidir.

* ### 1.Worst case: 

>En kötü durumda, örneğin liste tersten sıralıysa O(<td>n<sup>2</sup></td>) karmaşıklıkla çalışır.

* ### 2.Average case: 

>Insertion sort(Eklemeli sıralama) algoritması ortalama O(<td>n<sup>2</sup></td>) karmaşıklıkla çalışır.

* ### 3.Best case: 

>En iyi durumda, örneğin liste sıralıysa sadece (n - 1) karşılaştırma yapar ve O(n) karmaşıklıkla çalışır.

* ### Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer?

>Array'in ortasında yer aldığı için "Average Case" kapsamına girer.

* ### [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

> [7,3,5,8,2,9,4,15,6]

> [3,7,5,8,2,9,4,15,6]

> [3,5,7,8,2,9,4,15,6]

> [3,5,7,8,2,9,4,15,6]
