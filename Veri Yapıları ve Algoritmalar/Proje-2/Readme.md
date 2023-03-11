# [16,21,11,8,12,22] --> Merge Sort

* ### Yukarıda verilen dizinin Merge Sort'a göre aşamalarını yazınız.

>Merge Sort'un olayı, sıralı olmayan array'i eşit olarak ortadan 2 alt diziye ayırır, bu ayrıma işlemi alt diziler en fazla 2 elemanlı olana kadar devam eder daha sonrasında alt dizileri kendi içinde sıralayıp yine bu 2 alt diziyi tek bir sıralı dizi olacak şekilde birleştirir. Yukarıda ki array'in "Merge Sort"'a göre sıralanışı şu şekilde olacaktır -->

>1.Adım --> | `16 - 21 - 11` | 8 - 12 - 22 |

>2.Adım --> | `16 - 21` | 11 | `8 - 12` | 22 |

>3.Adım --> | `16` | `21` | `11` | `8` | `12` | `22` |

>4.Adım --> | `16 - 21` | 11 | `8 - 12` | 22 |

>5.Adım --> | `11 - 16 - 21` | 8 - 12 - 22 |

>6.Adım--> | 8 - 11 - 12 - 16 - 21 - 22 |

![Ornek resim](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Merge_sort_algorithm_diagram.svg/1024px-Merge_sort_algorithm_diagram.svg.png)

* ### Big-O gösterimini yazınız.

>O(n * log n)
