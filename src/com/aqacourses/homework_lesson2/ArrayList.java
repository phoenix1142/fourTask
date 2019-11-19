package com.aqacourses.homework_lesson2;
/*
2. Создаем ArrayList заносим туда любые значения с типом данных String.
Сортируем так чтобы ячейки стали в обратном порядке. То есть делаем реверс.
 */

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("Kiss");
        list.add("Queen");
        list.add("Guns N’Roses");
        list.add("The Rolling Stones");
        list.add("Led Zeppelin");
        list.add("AC/DC");

        System.out.println("--------------------------------------");
        System.out.println("Последовательность до реверса:");
        System.out.println("--------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

            Collections.reverse(list);

        System.out.println("--------------------------------------");
            System.out.println("Последовательность после реверса:");
        System.out.println("--------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
