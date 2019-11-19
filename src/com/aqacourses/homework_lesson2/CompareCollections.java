package com.aqacourses.homework_lesson2;
/*
3. Создаем HashSet в который добавляем следующие строки, каждая строка - новая ячейка:
pineapple
watermelon
apple
pear
quince
lemon
kiwi

Создаем LinkedList и добавляем тем же способом следующие строки:
plum
nut
apple
grape
peach
pear
cherry
orange
watermelon
apricot
pineapple

используя стандартные методы для сет сравнить две коллекции и удалить те элементы из сета которых нет в связанном списке.
В консоль с помощью цикла вывести каждый элемент сета ДО обработки, связанный список и сет ПОСЛЕ обработки
 */
import java.util.*;


public class CompareCollections {
    public static void main(String[] args) {

        HashSet<String> hashSetCol = new HashSet<>();        // создание первой коллекции
        hashSetCol.add("pineapple");
        hashSetCol.add("watermelon");
        hashSetCol.add("apple");
        hashSetCol.add("pear");
        hashSetCol.add("quince");
        hashSetCol.add("lemon");
        hashSetCol.add("kiwi");

        System.out.println("hashSet before sorting:");
//        System.out.println("1"+ hashSetCol);
        Iterator<String> i = hashSetCol.iterator();
        while (i.hasNext())
            System.out.println(i.next());



        String str1 = ("plum");                          // заведение объектов для второй коллекции
        String str2 =("nut");
        String str3 =("apple");
        String str4 =("peach");
        String str5 =("pear");
        String str6 =("cherry");
        String str7 =("orange");
        String str8 =("watermelon");
        String str9 =("apricot");
        String str10 =("pineapple");


        LinkedList<String> listCol = new LinkedList<>();        // создание второй коллекции
        listCol.add(str1);
        listCol.add(str2);
        listCol.add(str3);
        listCol.add(str4);
        listCol.add(str5);
        listCol.add(str6);
        listCol.add(str7);
        listCol.add(str8);
        listCol.add(str9);
        listCol.add(str10);

        System.out.println("-------------------------");
        System.out.println("listCol before sorting:");
//        System.out.println("2"+listCol);
        Iterator<String> j = listCol.iterator();
        while (j.hasNext())
            System.out.println(j.next());
        System.out.println("-------------------------");



        System.out.println("ThirdCol after compare:");
        Set<String> thirdCol = new HashSet<>(hashSetCol);                 // смешиваем коллекции
        thirdCol.addAll(hashSetCol);
        thirdCol.addAll(listCol);

//        System.out.println("3"+thirdCol);
        Iterator<String> k = thirdCol.iterator();
        while (k.hasNext())
            System.out.println(k.next());

        System.out.println("------------------");
        System.out.println("ThirdCol after retain:");
        hashSetCol.retainAll(listCol);

//        System.out.println("11"+thirdCol);

        Iterator<String> g = thirdCol.iterator();
        while (g.hasNext())
            System.out.println(g.next());




    }

}
