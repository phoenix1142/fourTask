package com.aqacourses.homework_lesson2;
/*1. Создаем HashMap и заносим туда следующие пары ключ-значение
"Test", 7
"Class", 4.5
"Cat", true
"Dog", null
"Bird", "Cat"
"Something", new Long(83)
"Mail", new Character('8')
"Tab", '2'
"Browser", 22222222222L
"IDE", (double) 489

С помощью цикла выводим их в виде "ключ-значение" в консоль
*/
import java.util.*;

public class HashMap {
    public static void main(String[] args) {
            java.util.HashMap<String, String> myHashMap = new java.util.HashMap<String, String>();
            myHashMap.put("Test","7");
            myHashMap.put("Class","4.5");
            myHashMap.put("Cat","true");
            myHashMap.put("Dog","null");
            myHashMap.put("Bird","Cat");
            myHashMap.put("Something","new Long(83)");
            myHashMap.put("Mail","new Character('8')");
            myHashMap.put("Tab","'2'");
            myHashMap.put("Browser","22222222222L");
            myHashMap.put("IDE","(double) 489");

        for (Map.Entry<String, String> wtf: myHashMap.entrySet()){
            System.out.println(wtf.getKey() + " - " + wtf.getValue());

        }
    }

}
