package com.aqacourses.homework_lesson3;
/*
Создаем класс Runner который содержит main метод
В главном методе сделать по одному экземпляру классов которые наследуют или имплементят.
Получить и распечатать имя дня по номеру, номер по имени, а также имя месяца по номеру.
И использовать два варианта метода printPhrase.

Итого у вас должно быть 6 классов (класс, интерфейс или энам) и выведено 5 строк в консоль.
 */

public class Runner {
    public static void main(String[] args) {
        Print print = new PrintImpl();
        System.out.println(print.returnDayNameByNum(2));
        System.out.println(print.returnDayNumByName("MONDAY"));
        print.printPhrase();
        AnotherClass anotherClass = new AnotherClass(4);
        anotherClass.printPhrase();


    }
}
