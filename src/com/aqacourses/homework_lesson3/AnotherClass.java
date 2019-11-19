package com.aqacourses.homework_lesson3;
/*
Создайте класс который наследуется от этого абстрактного класса. Класс должен содержать реализацию метода printPhrase который также принтит какую-то фразу.
А также содержать соответствующий конструктор.
 */
public class AnotherClass extends AbstractClass {

   public AnotherClass(int numOfMonth) {
        super(numOfMonth);
    }

    @Override
    void printPhrase() {
        System.out.println("Всё ещё тяжко!");
    }


}
