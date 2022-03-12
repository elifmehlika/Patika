# Insertion Sort  

## [22,27,16,2,18,6] -> Insertion Sort  

1- Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.  
~~~~
22 | 27 16 2 18 6
22 27 | 16 2 18 6
16 22 27 | 2 18 6
2 16 22 27 | 18 6
2 16 18 22 27 | 6
2 6 16 18 22 27 |
~~~~  
2- Big-O gösterimini yazınız.  
~~~~
Herbir sıralama aşamasının Big-O notation ile gösterilen zaman katsayılarını toplayıp,  
en büyük etkiye sahip olan terimini bularak bu sıralamanın Big-O notation gösterimini bulabiliriz.  
1 + n + n^2 + n^2 + n^2 + n^2
O(n^2)
~~~~  
3- Time Complexity
~~~~
BEST CASE: Listenin istenilen sırada olması, yalnızca karşılaştırma işlemi yapılır.  O(n)  
WORST CASE: Listenin istenilen sıralamanın tam tersi şeklinde sıralanmış olması,  
hem karşılaştırma hem de her bir eleman için yer değiştirme yapılır.  O(n^2)  
AVERAGE CASE: Best case ve worst case ortalaması  O(n^2)
~~~~  
4- Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.  
~~~~
Average Case
~~~~  
## [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.  
~~~~ 
7 | 3 5 8 2 9 4 15 6
2 7 | 5 8 2 9 4 15 6
2 5 7 | 8 2 9 4 15 6
2 5 7 8 | 2 9 4 15 6
~~~~
