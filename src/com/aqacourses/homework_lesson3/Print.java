package com.aqacourses.homework_lesson3;
/*
Создаем интерфейс с тремя методами
printPhrase который ничего не принимает и ничего не возвращает
returnDayNameByNum который принимает int numOfDay и возвращает строку.
returnDayNumByName который принимает строку name и возвращает int
 */
public interface Print {
    void printPhrase();
    String returnDayNameByNum(int numOfDay);        // должен возвращать string
    int returnDayNumByName(String name);        // должен возвращать int

}
