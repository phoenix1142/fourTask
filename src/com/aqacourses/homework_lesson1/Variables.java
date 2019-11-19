package com.aqacourses.homework_lesson1;
/*
Создать три переменные с типом данных int, double, String соответственно. Присвоить значение только переменной с типом int.
Запарсить её значение как строку и присвоить переменной с типом String.
Запарсить значение стринговой переменной как double и присвоить её в переменную с типом double.
Double присвоить обратно в int, Вывести в консоль значение каждой переменной.
 */

public class Variables {
    public static void main(String[] args) {
        int varInt = 5;
        String varString = Integer.toString(varInt);    //  возможно как вариант  - String varString = "" + varInt;
        double varDouble = Double.parseDouble(varString);
        varInt = (int) varDouble;

        System.out.println(varString);
        System.out.println(varDouble);
        System.out.println(varInt);

    }
}
