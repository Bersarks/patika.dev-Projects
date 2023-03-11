#Binary Search Tree

## [7,5,1,8,3,6,0,9,4,2]

* ### Yukarıda verilen dizinin Binary-Search-Tree aşamalarını yazınız.

>Binary Search Tree, node’lardan oluşan ve her bir node’un en fazla 2 child node’a sahip olduğu veri yapılarından biridir. 

>Binary Search Treede en üstte bulunan node Root olarak adlandırılır.

>Root’tan küçük değere sahip olan node’lar Root’un sol tarafında yer alır,

>Root’tan büyük değere sahip olan node’lar Root’un sağ tarafında yer alır.

1. Root'u 7 olarak ele alalım,
	- 5, 7'den küçük olduğu için 7'nin soluna gider,
	- 1, 7'den ve 5'ten küçük olduğu için 5'in soluna gider,
	- 8, 7'den büyük olduğu için 7'nin sağına gider,
	- 3, 7'den ve 5'ten küçük 1'den büyük olduğu için 1'in sağına gider,
	- 6, 7'den küçük 5'ten büyük olduğu için 5'in sağına gider,
	- 0, 7'den 5'ten ve 1'den küçük olduğu için 1'in soluna gider,
	- 9, 7'den ve 8'den büyük olduğu için 8'in sağına gider,
	- 4, 7'den ve 5'ten küçük 1'den büyük olduğu için 1'in sağına gider,
	- 2, 7'den ve 5'ten küçük 1'den büyük ve 3'ten küçük olduğu için 3'ün soluna gider

|   |   |   |   |   |   |   | 7 |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | / |   | \ |   |   |   |
|   |   |   |   |   | 5 |   |   |   | 8 |   |   |
|   |   |   |   | / |   | \ |   |   |   | \ |   |
|   |   |   | 1 |   |   |   | 6 |   |   |   | 9 |
|   |   | / |   | \ |   |   |   |   |   |   |   |
|   | 0 |   |   |   | 3 |   |   |   |   |   |   |
|   |   |   |   | / |   | \ |   |   |   |   |   |
|   |   |   | 2 |   |   |   | 4 |   |   |   |   |
